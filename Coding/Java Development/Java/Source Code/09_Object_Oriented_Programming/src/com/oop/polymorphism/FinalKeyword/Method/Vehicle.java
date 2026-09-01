package com.oop.polymorphism.FinalKeyword.Method;

public class Vehicle {
    //helps in creating immutable object, all private fields and no setter methods

    public void start(){
        System.out.println("Starting");
    }

    //using final can lead performance optimization, compiler can make certain assumptions about elements
    public final void engineName(){
        System.out.println("x@13rT");
    }
}
