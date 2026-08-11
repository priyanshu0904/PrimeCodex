import java.util.Scanner;

public class SearchIn2D {
    public static void main(String[] args) {
        System.out.println("Welcome to Search in 2D Array.....");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        int[][] numsArray = ArrayUtility.input2DArray();

        System.out.print("Please enter the number you want to search for: ");
        int key = sc.nextInt();

        boolean isFound = search(numsArray, key);
        if(isFound){
            System.out.println("Element Found.....");
        }
        else{
            System.out.println("Element Not Found....");
        }
    }

    public static boolean search(int[][] arr, int key){
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[0].length){
                if(arr[i][j] == key){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
