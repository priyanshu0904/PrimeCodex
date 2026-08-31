package com.oop.abstraction.abstractKeyword;

public class Test {
    static void main(String[] args) {
        //we can create object of vehicle which we don't want, without abstract
        //when abstract is applied then we can't create object of Vehicle which makes sense
        //Vehicle vh = new Vehicle(2);
        Car car = new Car();
        car.commute(); //can use property of vehicle through it's child class
        car.makeStartSound();

        MotorCycle motor = new MotorCycle();
        motor.commute();
        motor.makeStartSound();
    }
}
