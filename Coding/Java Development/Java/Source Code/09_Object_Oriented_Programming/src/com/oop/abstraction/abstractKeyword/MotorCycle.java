package com.oop.abstraction.abstractKeyword;

public class MotorCycle extends Vehicle{

    public MotorCycle() {
        super(2);
    }

    @Override
    public void makeStartSound() {
        System.out.println("Hummmm.....");
    }
}
