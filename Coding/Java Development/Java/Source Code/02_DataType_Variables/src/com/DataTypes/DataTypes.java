package com.DataTypes;

public class DataTypes {
    public static void main(String[] args){
        //everything has a binary value like character, emojis everything
        //1 bit - only store 0/1
        //1 byte = 8 bit
        //camelCase naming convention is used
        //byte, short, int, long, char, float, double, boolean

        //integer literal
        int myInt = 5; //5 is integer literal
        int Int = 9; //valid identifier
        System.out.println(myInt);
        System.out.println(Int);

        // long literal
        long myLong = 5555444L; //ends with L always
        System.out.println(myLong); 

        // 'b' is character literal
        char myChar = 'b'; //inside single quotes
        System.out.println(myChar); 

        // floating-point literal
        float myFloat = 5.0f; //f indicates the float
        System.out.println(myFloat); 

        float yourFloat = 5; //type conversion int to float
        System.out.println(yourFloat);

        //double literal
        double myDouble = 5.9; //by default double without f, and can use d also
        System.out.println(myDouble);

        // boolean literals
        boolean isHot = false; 
        System.out.println(isHot);

        //string literals
        String wishes = "May God bless you"; //inside double quotes
        System.out.println(wishes); 
    }
}
