package basics.of.classes.and.objects;

public class NewDriver {
    static int minimumAgeForDriving = 18;
    String name;
    int age;
    String dateOfLicense;

    public boolean isALlowedToDrive(){
        return this.age >= minimumAgeForDriving;
    }

    //Before constructor initialization, whenever the object created the constructor called and it has default values initialized like 0 null etc.

    public static void main(String[] args) {
        //This is the actual deep working of Car class, considering every parameters and methods
        Car swift = new Car();
        swift.addFuel(5);
        swift.start().drive(); //swift.start(); returns Car type and then on that Car type the drive() method calls through chaining...
        Car startedCar = swift.start();
        startedCar.drive();

        //can create objects of different classes
        NewDriver myDriver = new NewDriver();
        myDriver.dateOfLicense = "1/4/2026"; //can use non static member by creating object
        System.out.println(minimumAgeForDriving);//can directly access static memberss within same class
        //System.out.println(age);//can't use directly non static members
        System.out.println(myDriver.minimumAgeForDriving); //can access the static members using the object reference but it is not recommended
        System.out.println(NewDriver.minimumAgeForDriving);//Can also call using class name within same class

    }
}
