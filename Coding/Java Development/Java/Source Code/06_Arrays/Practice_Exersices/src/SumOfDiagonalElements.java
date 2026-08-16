import java.util.Scanner;

public class SumOfDiagonalElements {
    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Sum.....");
        System.out.println("Please Ensure that it must be a square matrix....\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int rows = sc.nextInt();
        int cols;

        while(true){
            System.out.print("Please Enter the number of columns: ");
            cols = sc.nextInt();
            if(cols == rows){
                break;
            }
            else{
                System.out.println("Rows and columns number must be same, Please enter again.....");
            }
        }
        int[][] numsArr = new int[rows][cols];
        int i = 0;
        while(i < rows){
            int j = 0;
            while(j < cols){
                System.out.print("Please enter the element of position, row " + (i + 1) + " and column " + (j + 1) + ": ");
                numsArr[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }

        long sum = sumOfDiagonal(numsArr);
        System.out.println("The sum of the diagonal elements is: " + sum);
    }

    public static long sumOfDiagonal(int[][] arr){
        long leftSum = sumOfLeftDiagonal(arr);
        long rightSum = sumOfRightDiagonal(arr);
        long sum = leftSum + rightSum;
        if(arr.length % 2 != 0){
            int index = arr.length / 2;
            sum -= arr[index][index];
        }
        return sum;
    }

    public static long sumOfLeftDiagonal(int[][] arr){
        long leftSum = 0;
        int i = 0;
        while(i < arr.length){
            leftSum += arr[i][i];
            i++;
        }
        return leftSum;
    }

    public static long sumOfRightDiagonal(int[][] arr){
        long rightSum = 0;
        int i = 0;
        while(i < arr.length){
            int col = arr.length - 1 - i;
            rightSum += arr[i][col];
            i++;
        }
        return rightSum;
    }
}
