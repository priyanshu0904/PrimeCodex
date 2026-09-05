package com.ArithmeticOperator;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to PrimeCodex Calculator.....\n");

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        //Bracket evaluates first and replace the result in place of expression
        //Want to evaluate any expression first, use brackets
        System.out.println("Addition is " + (num1 + num2)); //Addition operator
        System.out.println("Subtraction is " + (num1 - num2)); //Subtraction operator
        System.out.println("Multiplication is " + (num1 * num2)); //Multiplication operator
        System.out.println("Division is " + (num1 / num2)); //Division operator
        System.out.println("Remainder(Modulus) is " + (num1 % num2)); //Modulus operator (Remainder)

        //Modulus operator is only using with integer value, can be used with floating point value but makes no sense

        double myNum = 5;
        double yourNum = 3;
        System.out.println("Addition is " + (myNum + yourNum));
        System.out.println("Subtraction is " + (myNum - yourNum));
        System.out.println("Multiplication is " + (myNum * yourNum));
        System.out.println("Division is " + (myNum / yourNum));
        System.out.println("Remainder(Modulus) is " + (myNum % yourNum));

        //Concatenation rules -> Follows BODMAS
        //Use brackets always
        int a = 9, b = 5;
        System.out.println("Hello" + a + b); //Hello95 -> One String then further consider string to all like 9, 5
        System.out.println("Hello" + (a + b)); //Hello14
        System.out.println(a + b + "Hello"); //14Hello -> Left to Right calculation
        System.out.println("Hello" + a * b); //Hello45 -> BODMAS
        //System.out.println("ABC" + 9 - 5); gives error

        //If get one string then after that all the variables are considered as string only
    }
}
