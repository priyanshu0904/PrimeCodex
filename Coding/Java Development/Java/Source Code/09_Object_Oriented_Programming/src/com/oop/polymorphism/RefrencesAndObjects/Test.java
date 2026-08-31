package com.oop.polymorphism.RefrencesAndObjects;

public class Test {
    static void main(String[] args) {
        Car car = new Car();
        //Vehicle vehicle = new Car();
        Plane plane = new Plane();

        //Upcasting -> subclass to superclass reference, automatic and safe, access only to superclass methods
        //used for generalization in methods
        Vehicle vCar = new Car();
        //Car newCar = new Vehicle(); //compilation error
        vCar.start();
        vCar.print(); //superclass methods
        //vCar.noOfDoors(); //subclass method
        //Car cVehicle = (Car) new Vehicle();

        //castTest(vehicle);
        castTest(car);
        castTest(plane);

        Object ref = new Car(); //parent of all class

        //Downcasting, only access subclass-specific methods
        Vehicle newVehicle = new Car();
        Car c = (Car)newVehicle;
        c.start();
        c.noOfDoors();
        c.greet();
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
            //Downcasting -> superclass to subclass reference, manual and risky
            //needs instanceof check, access to subclass-specific methods
            //use for specific subclass behaviour
            Car veh = (Car) vehicle;
            System.out.println(veh.noOfDoors());
            veh.start();
        }
    }
}
