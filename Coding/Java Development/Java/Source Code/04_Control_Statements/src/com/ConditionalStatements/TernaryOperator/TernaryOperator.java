package com.ConditionalStatements.TernaryOperator;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        //Ternary Operator - Alternate to if-else - use for simple expressions
        //variable = condition/expression ? true/expression1 : false/expression2 ;, you can't write print statement direct
        //datatype of variable same as expression 1 and 2
        //nested possible but not recommended, don't overuse it, reduces clarity
        //conditional, decision-making statements

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to number checker....");
        System.out.print("Please enter your first number: ");
        int num1 = sc.nextInt();
        System.out.print("Now, Enter the second number: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is the greatest.");
        }
        else if(num1 == num2){
            System.out.println("Both are equal number.");
        }
        else{
            System.out.println(num2 + " is greatest.");
        }

        System.out.println("Using ternary.....");
        int greaterNumber = num1 > num2 ? num1 : num2; //use case of ternary operator
        System.out.println(greaterNumber + " is greatest.");
    }
}
