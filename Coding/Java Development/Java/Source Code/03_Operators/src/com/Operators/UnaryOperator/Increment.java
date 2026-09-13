package com.Operators.UnaryOperator;

public class Increment {
    public static void main(String[] args) {
        int x = 100;
        int y = x++;
        int z = ++x;
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);
    }
}
