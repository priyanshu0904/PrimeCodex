package com.DataTypesVariables.TypeConversion;

public class ExplicitTypeCasting {
    public static void main(String[] args) {
        //(targetType) value

        byte b = 100;
        int x = b;
        System.out.println("Value of x is " + x);

        int x1 = 100;
        byte b1 =(byte) x1;
        System.out.println("Value of b1 is " + b1);

        /*
        double -> float -> long -> int -> short -> byte
        int -> char
        */

        double myDouble = 9.78;
        int myInt = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myInt); //loss of value

        int i = 'a';
        System.out.println(i);
        char c = (char) 98;
        System.out.println(c);

        double doubleValue = 10.7;
        int result = (int) (doubleValue + 5.3);
        System.out.println(result);
    }
}
