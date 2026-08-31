package com.oop.polymorphism.RefrencesAndObjects;

public class Car implements Vehicle{
    public int noOfDoors(){
        return 5;
    }

    @Override
    public void start() {
        System.out.println("I am started");
    }
}
