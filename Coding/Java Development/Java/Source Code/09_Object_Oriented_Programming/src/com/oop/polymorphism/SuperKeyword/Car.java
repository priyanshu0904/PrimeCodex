package com.oop.polymorphism.SuperKeyword;

public class Car extends Vehicle{
    Car(){
        super();
    }

    //to call the immediate parent constructor is necessary
    Car(int noOfTyres, String name){
        super(noOfTyres, name);
        //super() can be used to invoke immediate parent class constructor
    }

    public int noOfDoors(){
        return 5;
    }

    @Override
    public void start() {
        System.out.println(super.getNoOfTyres());
        System.out.println("Car is Started");
    }

    public void display(){
        //super can be used to refer immediate parent class instance variable
        super.data = 8;

        //super can be used to invoke immediate parent class methods
        super.getNoOfTyres();
    }
}
