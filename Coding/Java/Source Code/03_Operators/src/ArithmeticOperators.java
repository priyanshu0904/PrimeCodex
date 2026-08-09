import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to PrimeCodex Calculator.....\n");

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Addition is " + (num1 + num2)); //Addition operator
        System.out.println("Subtraction is " + (num1 - num2)); //Subtraction operator
        System.out.println("Multiplication is " + (num1 * num2)); //Multiplication operator
        System.out.println("Division is " + (num1 / num2)); //Division operator
        System.out.println("Remainder(Modulus) is " + (num1 % num2)); //Modulus operator

        //Modulus operator is only using with integer value, can be used with floating point value but makes no sense

        double myNum = 5;
        double yourNum = 3;
        System.out.println("Addition is " + (myNum + yourNum));
        System.out.println("Subtraction is " + (myNum - yourNum));
        System.out.println("Multiplication is " + (myNum * yourNum));
        System.out.println("Division is " + (myNum / yourNum));
        System.out.println("Remainder(Modulus) is " + (myNum % yourNum));
    }
}
