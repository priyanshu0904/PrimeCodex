import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sum and Average Calculator...");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double average = average(numArray);

        System.out.println("Sum of the array is " + sum);
        System.out.println("Average of the number is " + average);

    }

    public static long sum(int[] arr){
        long sum = 0;
        int i = 0;
        while(i < arr.length){
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] arr){
        int num = arr.length;
        double sum = sum(arr);
        return sum / num;
    }
}
