package com.oop.abstraction.abstractKeyword;

public abstract class Vehicle {
    private int noOfTyres;

    //for abstract method, class must be abstract
    //abstract method is not defined in parent class
    //it is the responsibility of child
    public abstract void makeStartSound();

    public Vehicle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public void commute(){
        System.out.println("I am going");
    }
}
