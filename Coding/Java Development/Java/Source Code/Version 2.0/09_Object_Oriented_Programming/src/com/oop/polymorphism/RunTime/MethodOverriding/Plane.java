package com.oop.polymorphism.RunTime.MethodOverriding;

public class Plane extends Vehicle{
    @Override
    public void start() {
        //overridden method can be called through superclass reference holding a subclass object
        //using super keyword
        super.start(); //can also access parent's method
        System.out.println("Plane is Starting");
    }
}
