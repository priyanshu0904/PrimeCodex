import java.util.Scanner;

public class MaximumElementUsingForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to PrimeCodex...");
        MaximumElementUsingForEach maxi = new MaximumElementUsingForEach();
        int[] array = maxi.inputArray();
        int max = Integer.MIN_VALUE;
        for(int num : array){
            if(max < num){
                max = num;
            }
        }
        System.out.println("Maximum number is " + max);
    }

    public int[] inputArray(){
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
}
