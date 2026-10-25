package com.oop.encapsulation.demo;

import com.oop.encapsulation.AccessModifiers.AccessCar;

public class AccessDemo {
    public static void main(String[] args) {
        AccessCar car = new AccessCar("Orange", "Porsche",
                18.9, 800000);
        //car.costOfPurchase = 8;
        //private field, can't access

        //Demo class is default, can't access in other package
        //com.oop.encapsulation.AccessModifiers.Demo df = new com.oop.encapsulation.AccessModifiers.Demo();
        com.oop.encapsulation.AccessModifiers.AccessCar ac = new com.oop.encapsulation.AccessModifiers.AccessCar();
    }
}
