package basic.theory;

import practical.theory.NewDriver;

public class DeclaringObjects {
    public static void main(String[] args) {
        NewDriver driver = new NewDriver();
        //As the object of this class is called, the constructor is called for initialization
        //new allows dynamic memory allocation at runtime

        //To access the variables or methods for this object, use dot( . ) operator
        driver.name = "Kishan";
        driver.age = 38;
        System.out.println(driver.name);
        System.out.println(driver.age);
        System.out.println(driver.isALlowedToDrive());

        //Creation of new object of same class doesn't affect others, same properties different values
        //One class many objects
        //If we have changed anything in NewDriver class, other objects doesn't get to know that, chori chori chupke chupke

        NewDriver newDriver = new NewDriver();
        newDriver.name = "Priyanshu";
        newDriver.age = 17;
        System.out.println(newDriver.name);
        System.out.println(newDriver.age);
        System.out.println(newDriver.isALlowedToDrive());
    }
}
