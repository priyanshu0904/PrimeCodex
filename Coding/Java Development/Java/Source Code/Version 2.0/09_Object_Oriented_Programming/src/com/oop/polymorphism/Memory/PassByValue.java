package com.oop.polymorphism.Memory;

public class PassByValue {
    //it is java's default method, copies argument value to function parameter
    //changes in function doesn't affect original variable
    public static int add(int a, int b){ //makes copy of actual argument
        a += b;
        return a;
    }

    //primitive data type always passed by value, in-function change don't impact original
}
