package practical.theory;

public class Car { //Class
    //Instance variables or properties or attribute
    static int noOfCarsSold; //static variables, shared by all objects
    int noOfWheels; //used globally, global variable
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    //code blocks
    static {
        //static block -> Runs once, when class loaded
        noOfCarsSold = 0;
        System.out.println("I am in static block.");
    }

    {
        //Initialization block -> Run each time immediately after object creation
        noOfCarsSold++;
        System.out.println("I am in initialization block.");
    }

    //By-default default values are assigned when no explicit constructor are in the class, Default constructor called by compiler

    //Constructor
    Car(String color){ //Default and Parameterized Constructor
        //can use all parameters in parameterized constructor
        this.color = color; //This refers to current object
        noOfWheels = 4;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }

//    Car(){ //No Argument Constructor
//
//        color = "Red";
//        noOfWheels = 3;
//        maxSpeed = 150;
//        currentFuelInLiters = 2;
//        noOfSeats = 5;
//    }

    Car(){
        //Constructor Chaining
        //this used to invoke another constructor of same class
        this("Black"); //Must be first statement
        currentFuelInLiters = 5;
    }

    //Instance methods
    public Car start(){
        if(currentFuelInLiters == 0){
            System.out.println("Car is out of fuel..., can not start");
        }else if(currentFuelInLiters < 5){
            System.out.println("Car is in reserved mode, please refuel");
        }else{
            System.out.println("Car is Started....bruhhhhhh......");
        }

        //Return current class instance from method
        return this;
    }

    public void drive(){
        currentFuelInLiters--;
        System.out.println("Car is Driving...");
    }

    public void addFuel(float currentFuelInLiters){ //Priority given to argument, because both are same, that's why use this keyword
        this.currentFuelInLiters = currentFuelInLiters;
        //currentFuelInLiters += currentFuelInLiters;
    }

    public void removeFuel(float fuel){ //local variable
        currentFuelInLiters -= fuel;
        //makes no sense, but it's the demo that parameters can be both type, can use same parameters as variables or different 
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }

    @Override
    protected void finalize() throws Throwable {
        //Finalize is not in use now.
        System.out.println("I am in finalize.");
    }
}
