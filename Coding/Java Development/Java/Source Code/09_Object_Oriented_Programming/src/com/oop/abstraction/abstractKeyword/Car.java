package com.oop.abstraction.abstractKeyword;

public class Car extends Vehicle {
    private int noOfDoors;

    //constructor of parent must be called in child, if explicit constructor
    public Car() {
        super(4);
    }

    //subclasses must have to implement all abstract methods of its parent abstract class
    //if you don't want to implement, just declare that class also as abstract, now responsibility goes to current class child
    @Override
    public void makeStartSound() {
        System.out.println("Vrooooom.....");
    }
}
