package com.DataTypes;

public class FloatingPointTypes {
    public static void main(String[] args) {
        int myInt = 10 / 3;
        System.out.println("myInt: " + myInt);

        //float -> 32-bits or 4 Bytes
        float myFloat = 10.25f / 3f; //7-digit precision
        System.out.println("myFloat: " + myFloat);

        //double -> 64-bits or 8 Bytes
        double myDouble = 10.25d / 3d; //16-digit precision
        System.out.println("myDouble: " + myDouble);
    }
}
