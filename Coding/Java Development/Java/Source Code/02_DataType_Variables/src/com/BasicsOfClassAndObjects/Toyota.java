package com.BasicsOfClassAndObjects;

public class Toyota {
    static void main(String[] args) {
        //creating another instance of Car class
        Car toyota = new Car();
        toyota.make = "Toyota";
        toyota.model = "Fortuner";
        toyota.year = 2022;

        toyota.startEngine();
        toyota.stopEngine();
    }
}
