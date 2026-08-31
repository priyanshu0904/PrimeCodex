package com.oop.polymorphism.RunTime.MethodOverriding;

public class Car extends Vehicle{
    private final int noOfTyres = 5;
    @Override
    public void start() {
        System.out.println(this.noOfTyres);
        System.out.println("Car is Starting");
    }
}
