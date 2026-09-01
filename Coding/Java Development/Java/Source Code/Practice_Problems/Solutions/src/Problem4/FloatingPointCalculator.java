package Problem4;

import java.util.Scanner;

public class FloatingPointCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Floating-Point Calculator....");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first decimal number: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter the second decimal number: ");
        double number2 = sc.nextDouble();

        double addition = number1 + number2;
        System.out.println("The Addition of " + number1 + " and " + number2 + " is: " + addition);

        double subtraction = number1 - number2;
        System.out.println("The Subtraction of " + number1 + " and " + number2 + " is: " + subtraction);

        double multiplication = number1 * number2;
        System.out.println("The Multiplication of " + number1 + " and " + number2 + " is: " + multiplication);

        double division = 0;
        if(number2 == 0){
            System.out.println("0 at the bottom is not allowed, try different values.....");
        }else{
            division = number1/number2;
            System.out.println("The Division of " + number1 + " and " + number2 + " is: " + division);

        }
    }
}
