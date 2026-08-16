package basics;

public class Driver {
    public static void main(String[] args) {
        //Creating Object of Car class
        Car myCar;//declaring class
        myCar = new Car();
        //Just a demo and considering only drive method, such that considering car is started and have enough petrol.
        System.out.println(myCar.color);
        System.out.println(myCar.currentFuelInLiters);

        //Using dot operator to accessing the members/properties of that class or object
        myCar.addFuel(6);

        myCar.start();
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());

        myCar.start();
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());

        myCar.addFuel(3);

        myCar.start();
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());

        myCar.start();
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());

        myCar.addFuel(5);

        myCar.start();
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());

        myCar.start();
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());

        //multiple objects of same class can be created
        Car yourCar = new Car();
        yourCar.color = "Blue";
        yourCar.addFuel(5);
        System.out.println("This is a different car having color " + yourCar.color + " and current fuel level is " + yourCar.currentFuelInLiters);

        System.out.println(NewDriver.minimumAgeForDriving);//can access static members without creating object directly by class name
        NewDriver newDriver = new NewDriver();
        System.out.println(newDriver.dateOfLicense);//can access non static members by creating object of that class
        System.out.println(newDriver.minimumAgeForDriving);//can access static members using object name in different class but not recommended
    }
}
