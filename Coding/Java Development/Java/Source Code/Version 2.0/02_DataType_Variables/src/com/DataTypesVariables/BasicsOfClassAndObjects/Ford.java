package com.DataTypesVariables.BasicsOfClassAndObjects;

public class Ford {
    static void main(String[] args) {
        //creating instance of Car Class
        Car ford = new Car();
        ford.make = "Ford";
        ford.model = "Mustang";
        ford.year = 2025;

        ford.startEngine();
        ford.stopEngine();
    }
}
