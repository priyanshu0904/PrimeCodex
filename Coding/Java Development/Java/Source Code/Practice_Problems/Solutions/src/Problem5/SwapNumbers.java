package Problem5;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println("Welcome to Swapping Machine.....\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Swapping using temporary variable....");
        System.out.print("Please enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Please enter second number: ");
        int number2 = sc.nextInt();

        //Swapping using temporary variable
        System.out.println("Before swapping the numbers are: " + number1 + " and " + number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("After swapping the numbers are: " + number1 + " and " + number2);

        //Swapping using arithmetic operations
        System.out.println("Swapping using arithmetic operation....");
        System.out.print("Please enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Please enter second number: ");
        int num2 = sc.nextInt();

        //Swapping using Bitwise XOR operation
        System.out.println("Before swapping the numbers are: " + num1 + " and " + num2);
        num1 = num1 + num2; //may be int limit exceed
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping the numbers are: " + num1 + " and " + num2);

        System.out.println("Swaping using XOR operator.....");
        System.out.print("Please enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Please enter second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("Before swapping the numbers are: " + firstNumber + " and " + secondNumber);
        firstNumber = firstNumber ^ secondNumber;
        secondNumber = firstNumber ^ secondNumber;
        firstNumber = firstNumber ^ secondNumber;
        System.out.println("After swapping the numbers are: " + firstNumber + " and " + secondNumber);
    }
}
