import java.util.Scanner;

public class NoOfOccurrenceInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Find the Number of Occurrences in Array....");
        int[] numArray = ArrayUtility.inputArray();

        System.out.print("Please enter the number you want to know the frequency of: ");
        int key = sc.nextInt();

        int frequency = noOfOccurrences(numArray, key);

        System.out.println(key + " occurs " + frequency + " times in the array.");

        int min = MinMaxElement.minArray(numArray);
        System.out.println("The minimum of this array is " + min);

    }

    public static int noOfOccurrences(int[] arr, int key){
        int i = 0;
        int count = 0;
        while(i < arr.length){
            if(arr[i] == key){
                count++;
            }
            i++;
        }
        return count;
    }
}
