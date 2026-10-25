import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Welcome to Digit Sum Calculator: ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("The sum of digits of " + num + " is: " + digitSum(num));
    }

    public static int digitSum(int num) {
        int sum = 0; //Called as accumulator pattern, in which things are added one by one
        while (num > 0) {
            sum += (num % 10) ;
            num /= 10;
        }
        return sum;
    }
}
