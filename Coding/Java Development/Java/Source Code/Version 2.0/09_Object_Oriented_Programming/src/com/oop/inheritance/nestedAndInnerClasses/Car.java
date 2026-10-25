package com.oop.inheritance.nestedAndInnerClasses;

public class Car { //outer class
    //static nested class and non-static or inner class
    //useful for logically grouping classes, improving encapsulation, enhances code readability

    private int noOfDoors;
    static String name = "G-Wagon";

    public void repair(){
        Tyre ty = new Tyre();
    }

    protected class Tyre{
        //non-static or inner class
        //associated with instance of outer class
        //can access all members of outer class including private ones
        private double width;
        private double pressure;
        private String material;

        public void inflate(){
            noOfDoors = 4;
            System.out.println(name);
        }
    }

    protected static class Wheels{
        //static nested class
        //act as static member of outer class
        private double radius;
        private int noOfWheels;

        public void start(){
            System.out.println(name); //static class can use only static members of outer class directly
            //System.out.println(noOfDoors); //can not use non-static members directly
            Car car = new Car();
            car.noOfDoors = 4;
            //can access by creating object
        }


        //Local Inner Classes are defined within a block or methods and are not visible outside it
        //Anonymous inner Classes are nameless and used for single-use implementation
    }
}
