import java.util.Scanner;

public class SumPositiveUsingContinue {
    public static void main(String[] args) {
        System.out.println("Welcome to adding positive numbers....");
        Scanner sc = new Scanner(System.in);

        MaximumElementUsingForEach maxi = new MaximumElementUsingForEach();
        int[] array = maxi.inputArray();

        int sum = 0;
        for(int nums : array){
            if(nums < 0){
                continue;
            }
            sum += nums;
        }

        System.out.println("The sum of positive numbers is " + sum);
    }
}
