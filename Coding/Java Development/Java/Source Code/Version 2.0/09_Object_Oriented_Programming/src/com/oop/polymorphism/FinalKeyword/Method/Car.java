package com.oop.polymorphism.FinalKeyword.Method;

public class Car extends Vehicle{
    @Override
    public void start() {
        System.out.println("Car is started");
    }

    //final method can not be overridden by subclass
//    @Override
//    public void engineName() {
//        System.out.println("x@134rTY");
//    }

    Car(){
        engineName(); //final method can be used but can't be overridden
    }
}
