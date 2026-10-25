package com.oop.inheritance.basics;

public class Vehicle {
    //inheritance allows a new class to inherit features from an existing super class
    //code reusability
    //protected access modifier used, subclass can access superclass even from different packages

    public int noOfWheels;
    private int petrol;
    //private, any child class can't use it directly

    int defaultValue; //can accessible in same package only

    protected int tyres; //protected, accessible in same package and in other package, just accessible to child only

    public void setPetrol(int petrol){
        this.petrol = petrol;
    }

    public void commute(){
        System.out.printf("I am going to place A to place B using %d tyres.\n",noOfWheels);
    }
}
