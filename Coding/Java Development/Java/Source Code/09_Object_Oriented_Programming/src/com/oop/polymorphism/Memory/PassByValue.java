package com.oop.polymorphism.Memory;

public class PassByValue {
    public static int add(int a, int b){ //makes copy of actual argument
        a += b;
        return a;
    }
}
