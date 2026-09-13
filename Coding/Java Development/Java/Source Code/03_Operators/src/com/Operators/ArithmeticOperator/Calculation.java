package com.Operators.ArithmeticOperator;

public class Calculation {
    public static void main(String[] args) {
        //Arithmetic Operators
        int a = 10, b = 20;
        int c = 15;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("b % c = " + (b % c));

        //++, -- are also Arithmetic operators
        System.out.println("a = " + a);
        //a = a + 1;
        a++; //Equivalent to a = a + 1
        System.out.println("a++ = " + a);

        a--; //Equivalent to a = a - 1
        System.out.println("a-- = " + a);
    }
}
