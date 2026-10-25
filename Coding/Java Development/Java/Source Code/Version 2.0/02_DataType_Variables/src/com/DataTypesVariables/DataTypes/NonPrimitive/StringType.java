package com.DataTypesVariables.DataTypes.NonPrimitive;

public class StringType {
    public static void main(String[] args) {
        //ways to initialize String
        String name = "Priyanshu Raj";

        String greeting = new String("Hello, World!!");

        System.out.println("Hello World!!!");
        System.out.println(name);
        System.out.print(greeting);
        System.out.println();

        //String concatenation
        System.out.println("Hello, " + "World");
        System.out.println("I have " + 5 + " apples.");

        //String Formatting
        System.out.printf("Hello, %s you have %d apples.\n", name, 9);
    }
}
