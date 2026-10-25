package com.oop.encapsulation.GettersSetters;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Red", "xUV", 55, 880000);
        System.out.println(car.getColor());
        car.setColor("Pink"); //default, can change in same package
        System.out.println(car.getColor());

        System.out.println(car.getModel());
        System.out.println(car.getCostOfPurchase());
        car.setFuelLevel(88);
        System.out.println(car.getFuelLevel());
    }
}
