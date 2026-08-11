import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        int i = 0;
        while(i < size){
            System.out.print("Please Enter Element number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
            i++;
        }

        return nums;
    }

    public static void displayArray(int[] arr){
        int i = 0;
        while(i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
    }

    public static int[][] input2DArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the numbers of rows: ");
        int rows = sc.nextInt();
        System.out.print("Please enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] numsArray = new int[rows][cols];

        int i = 0;
        while(i < rows){
            int j = 0;
            while(j < cols){
                System.out.print("Please enter the element of position, row " + (i + 1) + " and column " + (j + 1) + ": ");
                numsArray[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        return numsArray;
    }

    public static void display2D(int[][] arr){
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[0].length){
                System.out.println("The element at row " + (i + 1) + " and column " + (j + 1) + " is: " + arr[i][j]);
                j++;
            }
            i++;
        }
    }
}
