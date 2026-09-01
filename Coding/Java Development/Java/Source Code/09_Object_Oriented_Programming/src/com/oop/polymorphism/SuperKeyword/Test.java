package com.oop.polymorphism.SuperKeyword;

public class Test {
    static void main(String[] args) {
        Car car = new Car(5, "Car");
        Plane plane = new Plane(7, "Airbnb");

        car.start();
        plane.start();
    }
}
