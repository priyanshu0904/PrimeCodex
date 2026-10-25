package com.oop.inheritance.objectClass;

public class Vehicle {
    //object class is the super class of all class, if any class is not inherited, no extends then automatically inherited by object class
    //in inherited class also like child class, object class become grandparent


    protected int noOfTyres;
    protected String name;

    protected void drive(){
        System.out.println("My vehicle is driving.");
    }

    //redefining any method inherited from parent, use @Override
    @Override
    public String toString() {
        return "No of tyres in my vehicle: " + noOfTyres;
    }
}
