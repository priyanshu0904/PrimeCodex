import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to PrimeCodex Calculator....\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Results are........");
        System.out.println("Addition is " + (num1 + num2));
        System.out.println("Subtraction is " + (num1 - num2));
        System.out.println("Multiplication is " + (num1 * num2));
        System.out.println("Division is " + (num1 / num2));
        System.out.println("Remainder is " + (num1 % num2));
    }
}
