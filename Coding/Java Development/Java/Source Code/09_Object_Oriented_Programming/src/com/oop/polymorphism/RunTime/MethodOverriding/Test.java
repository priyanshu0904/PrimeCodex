package com.oop.polymorphism.RunTime.MethodOverriding;

public class Test {
    static void main(String[] args) {
        Car car = new Car();
        Plane plane = new Plane();
        Auto auto = new Auto();

        car.start();
        plane.start();
        auto.start();

        System.out.println();

        //run-time
        //method call is determined by object's type at runtime
        castTest(car);
        castTest(plane);
        castTest(auto);
    }

    public static void castTest(Vehicle vehicle){
        vehicle.start();
        //method is called for object not for reference
    }
}
