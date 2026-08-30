package com.oop.inheritance.nestedAndInnerClasses;

public class Car {
    private int noOfDoors;

    public void repair(){
        Tyre ty = new Tyre();
    }

    protected class Tyre{
        private double width;
        private double pressure;
        private String material;

        public void inflate(){
            noOfDoors = 4;
        }
    }
}
