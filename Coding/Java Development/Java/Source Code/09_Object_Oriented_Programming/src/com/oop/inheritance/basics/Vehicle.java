package com.oop.inheritance.basics;

public class Vehicle {
    public int noOfWheels;
    private int petrol;
    //private, any child class can't use it directly

    int defaultValue; //can accessible in same package only

    protected int tyres; //protected, accessible in same package and in other package, just accesible to childs only

    public void setPetrol(int petrol){
        this.petrol = petrol;
    }

    public void commute(){
        System.out.printf("I am going to place A to place B using %d tyres.\n",noOfWheels);
    }
}
