package com.oop.inheritance.basics;

public class TwoWheeler extends Vehicle{
    TwoWheeler(){
        noOfWheels = 2;
        //petrol = 55; //private
        setPetrol(22); //can use by setter
        defaultValue = 55; //default, can use in same package only
        tyres = 50; //protected, can use in same package
    }

    public void balance(){
        System.out.println("I am balancing on 2 tyres.");
    }
}
