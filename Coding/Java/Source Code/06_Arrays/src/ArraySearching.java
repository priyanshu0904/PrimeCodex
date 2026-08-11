import java.util.Scanner;

public class ArraySearching {

    //Array Searching..
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 9, 15, 78, 154, 125, 66, 88, 75, 25};
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Array Searching....");

        System.out.print("Enter the number you want to searching: ");
        int input = sc.nextInt();

        boolean isFound = isFound(arr, input);

        if(isFound){
            System.out.println("Your number was found in the array.");
        }
        else{
            System.out.println("Your number was not found in the array..");
        }
    }

    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while(index < arr.length){
            if(arr[index] == num) return true;
            index++;
        }
        return false;
    }
}
