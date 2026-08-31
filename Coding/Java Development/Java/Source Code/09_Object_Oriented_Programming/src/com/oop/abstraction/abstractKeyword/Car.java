package com.oop.abstraction.abstractKeyword;

public class Car extends Vehicle {
    private int noOfDoors;

    //constructor of parent must be called in child, if explicit constructor
    public Car() {
        super(4);
    }

    @Override
    public void makeStartSound() {
        System.out.println("Vrooooom.....");
    }
}
