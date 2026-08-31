package com.oop.polymorphism.RefrencesAndObjects;

public class Test {
    static void main(String[] args) {
        Car car = new Car();
        //Vehicle vehicle = new Car();
        Plane plane = new Plane();

        Vehicle vCar = new Car();
        //Car cVehicle = (Car) new Vehicle();

        //castTest(vehicle);
        castTest(car);
        castTest(plane);

        Object ref = new Car(); //parent of all class
    }

    private static void castTest(Vehicle vehicle){
        vehicle.start();
        //reference can be of interface

        //when assured, Car is the only reference coming, then do explicit casting
//        Car cVehicle = (Car) vehicle;
//        ((Car) vehicle).noOfDoors();
//        cVehicle.start();
//        cVehicle.noOfDoors();
        if(vehicle instanceof Car){
            Car veh = (Car) vehicle;
            veh.noOfDoors();
            veh.start();
        }
    }
}
