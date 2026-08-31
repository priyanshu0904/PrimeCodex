package com.oop.polymorphism.SuperKeyword;

public abstract class Vehicle {
    private int noOfTyres;

    Vehicle(){
        this.noOfTyres = 0;
    }

    Vehicle(int noOfTyres){
        this.noOfTyres = noOfTyres;
    }

    public int getNoOfTyres(){
        return this.noOfTyres;
    }

    public abstract void start();
}
