package com.oop.polymorphism.SuperKeyword;

public class Plane extends Vehicle{
    Plane(int noOfTyres, String name){
        super(noOfTyres, name);
    }

    @Override
    public void start() {
        System.out.println("Plane is taking off");
    }
}
