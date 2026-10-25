package com.oop.encapsulation.demo;

import com.oop.encapsulation.GettersSetters.Car;

public class GetterSetterTest {
    public static void main(String[] args) {
        Car car = new Car("Red", "Suzuki",
                15.9, 800);
        System.out.printf("%s %s", car.getColor(), car.getModel());
        //car.setColor("Blue"); //default, can't change in different package
    }
}
