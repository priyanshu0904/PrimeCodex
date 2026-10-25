package com.oop.encapsulation.AccessModifiers;

public class Test {
    public static void main(String[] args) {
        AccessCar car = new AccessCar();
        car.color = "Red";
        car.model = "G-Wagon";
        car.costOfPurchase = 15000000;
        //car.fuelLevel = 12.5;

        AccessCar newCar = new AccessCar("Black", "BMW",
                15.9, 8000000);
        System.out.println(car);
        System.out.println(newCar);

        Demo df = new Demo();
        df.demo = 55;
        //default, can use in same package
    }
}
