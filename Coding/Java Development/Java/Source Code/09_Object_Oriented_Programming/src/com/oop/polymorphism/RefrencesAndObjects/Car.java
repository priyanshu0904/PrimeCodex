package com.oop.polymorphism.RefrencesAndObjects;

public class Car implements Vehicle{
    public int noOfDoors(){
        return 5;
    }

    public void greet(){
        System.out.println("Good evening ji");
    }

    @Override
    public void start() {
        System.out.println("I am started");
    }
}
