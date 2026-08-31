package com.oop.polymorphism.SuperKeyword;

public class Plane extends Vehicle{
    Plane(int noOfTyres){
        super(noOfTyres);
    }

    @Override
    public void start() {
        System.out.println("Plane is taking off");
    }
}
