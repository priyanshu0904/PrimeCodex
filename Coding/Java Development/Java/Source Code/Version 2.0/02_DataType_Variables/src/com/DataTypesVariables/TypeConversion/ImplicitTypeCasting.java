package com.DataTypesVariables.TypeConversion;

public class ImplicitTypeCasting {
    public static void main(String[] args) {
        byte b = 100;
        int x = b;
        System.out.println("Value of x is " + x);

        /*
        byte -> short -> int -> long -> float -> double
        char -> int
        */

        int i = 100;
        double d = i;
        System.out.println("Value of d is " + d);

        char c = 'a';
        int l = c; //ASCII Value
        System.out.println("Value of l is " + l);

        int intValue = 3;
        double doubleValue = 2.5;
        double result = intValue + doubleValue; //intValue is implicitly casted to double
        System.out.println("Value of result is " + result);
    }
}
