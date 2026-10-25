package com.oop.abstraction.interfaces;

public class Test {
    static void main(String[] args) {
        //car object can use all the things of all parent classes
        Car car = new Car();
        System.out.println(car.getNoOfTyres());
        car.setNoOfTyres(5);
        System.out.println(car.getNoOfTyres());
        car.commute();
        car.getSetGo();

        System.out.println(car.getNoOfDoors());
        car.setNoOfDoors(8);
        System.out.println(car.getNoOfDoors());
        car.makeStartSound();
        car.addFuel();
    }
}
