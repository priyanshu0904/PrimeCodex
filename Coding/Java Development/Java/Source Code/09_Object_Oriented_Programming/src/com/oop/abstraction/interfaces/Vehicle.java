package com.oop.abstraction.interfaces;

public abstract class Vehicle implements Transport{
    //can use extends and implements simultaneously
    //this is also a type of inheritance, but use implements, since it is interface
    private int noOfTyres;

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
        System.out.println("I am Going...");
    }

    //the function of Transport class can be defined here
    //if not defined here then responsibility move to its child class
    @Override
    public void getSetGo() {
        System.out.println("Going to place");
    }
}
