import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ODD Sum");
        System.out.print("Please enter your number: ");
        int num = sc.nextInt();

        int sum = oddSum(num);
        System.out.println("The sum of all odd numbers till " + num + " is: " + sum);

    }

    public static int oddSum(int num){
        int i = 1;
        int sum = 0;
        while(i <= num){
            sum += i;
            i += 2;
        }
        return sum;
    }
}
