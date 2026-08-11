import java.util.Scanner;

public class DeletingElementOfArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Deleting Element from Array...");
        int[] numsArray = ArrayUtility.inputArray();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to delete: ");
        int numToDelete = sc.nextInt();

        int[] freshArray = deleteNumber(numsArray, numToDelete);

        System.out.println("Array before " + numToDelete + " deletion: ");
        ArrayUtility.displayArray(numsArray);

        System.out.println();

        System.out.println("Array after " + numToDelete + " deletion: ");
        ArrayUtility.displayArray(freshArray);

    }

    public static int[] deleteNumber(int[] arr, int numToDelete){
        int occurKey = NoOfOccurrenceInArray.noOfOccurrences(arr, numToDelete);
        if(occurKey == 0){
            return arr;
        }
        int length = arr.length - occurKey;
        int[] newArray = new int[length];

        int i = 0;
        int j = 0;
        while(i < arr.length){
            if(arr[i] != numToDelete){
                newArray[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArray;
    }
}
