package com.oop.polymorphism.RunTime.MethodOverriding;

public class Plane extends Vehicle{
    @Override
    public void start() {
        super.start(); //can also access parent's method
        System.out.println("Plane is Starting");
    }
}
