package com.oop.abstraction.interfaces;

public class Car extends Vehicle {
    private int noOfDoors;

    public Car() {
        super(4);
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    @Override
    public void makeStartSound() {
        System.out.println("Vrooommmm....");
    }

    //function of transport class, not defined in vehicle, so responsibility comes here
    @Override
    public void addFuel() {
        System.out.println("5 liters fuel is added");
    }
}
