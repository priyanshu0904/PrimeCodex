package com.oop.abstraction.abstractKeyword;

public class MotorCycle extends Vehicle{

    public MotorCycle() {
        super(2);
    }

    //design flexibility of classes, defining a contract for subclasses, implement abstract method specifically
    @Override
    public void makeStartSound() {
        System.out.println("Hummmm.....");
    }
}
