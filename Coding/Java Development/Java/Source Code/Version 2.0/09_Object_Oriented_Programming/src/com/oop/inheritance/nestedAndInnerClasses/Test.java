package com.oop.inheritance.nestedAndInnerClasses;

public class Test {
    static void main(String[] args) {
        Car.Wheels wheels = new Car.Wheels();
        wheels.start();
        //you can make static class object just by Outer class name and Inner class name

        Car car = new Car();
        Car.Tyre tyre = car.new Tyre();
        tyre.inflate();
        //to create object of inner class
    }
}
