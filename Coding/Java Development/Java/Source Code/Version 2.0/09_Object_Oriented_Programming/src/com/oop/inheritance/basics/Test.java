package com.oop.inheritance.basics;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(); //grandparents
        vehicle.commute();
        vehicle.noOfWheels = 8;

        TwoWheeler tw = new TwoWheeler(); //parents
        tw.commute();
        tw.balance();
        System.out.println(tw.noOfWheels);

        MotorCycle motor = new MotorCycle(); //child
        System.out.println(motor.noOfWheels);
        motor.petrolCapacity = 22;
        motor.commute();
        motor.balance();
        motor.start();
    }
}
