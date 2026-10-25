package com.oop.abstraction.abstractKeyword;

public abstract class Vehicle {
    //abstract class and abstract method
    //abstract class -> you can't create object of it directly, non-instantiable, base classes
    //abstract method -> defines method without implementations, subclasses will define it by specific functionality
    //for abstract method, class must be abstract but vice versa is not true

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
