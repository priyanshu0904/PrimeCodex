package com.Operators.StatementsAndExpressions;

public class StatementsAndExpressions {
    public static void main(String[] args) {
        //Expressions
        //Arithmetic Expression
        int result = 5 + 3;

        //Variable Assignment
        int a = 10;

        //Method Calls
        String greeting = "Hello, ";
        String name = "Priyanshu";
        String message = greeting + name.toUpperCase();
        System.out.println(message);

        //Comparison Expressions
        boolean isGreaterThan = (5 > 3);

        //Statements
        //Assignment Statement
        int x = 10;

        //Conditional Statement
        int temperature = 55;
        if(temperature > 30){
            System.out.println("It's hot outside.");
        }else{
            System.out.println("It's not too hot.");
        }

        //RULES:
        //Termination: Every statement in java must end with a ;
        int x1 = 10;

        //Block Statements: A block of code is enclosed within braces { and } and can contain multiple statements
        if(x > 5){
            System.out.println("Hello x");
            x = x - 5;
        }

        //Expression Statements: These are expressions that are written as statements.
        //Common examples include method calls, assignments, increment/decrement operations.
        System.out.println("Hello World"); //Method Call
        x = x + 5; //Assignment
        x++; //Increment

        //Declaration Statements: These are statements where you declare a variable.
        int y;
        double rate = 5.6;

        //Empty Statements: Just a standalone semicolon. It doesn't do anything and is sometimes used as a placeholder.
        ; //This is a valid but empty statement.

        //Search about type of expression and statements and rules
    }
}
