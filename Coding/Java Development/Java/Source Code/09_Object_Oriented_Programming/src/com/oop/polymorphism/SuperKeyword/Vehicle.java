package com.oop.polymorphism.SuperKeyword;

public abstract class Vehicle {
    private int noOfTyres;
    private String name;
    protected int data;

    Vehicle(){
        this.noOfTyres = 0;
    }

    Vehicle(int noOfTyres, String name){
        this.noOfTyres = noOfTyres;
        this.name = name;
    }

    public int getNoOfTyres(){
        return this.noOfTyres;
    }

    public abstract void start();
}
