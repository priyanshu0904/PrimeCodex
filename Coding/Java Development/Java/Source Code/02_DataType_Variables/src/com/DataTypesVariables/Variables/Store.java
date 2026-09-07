package com.DataTypesVariables.Variables;

public class Store {
    public static void main(String[] args) {
        //Variables
        //Declaration
        int firstVariable;
        String name;
        //int firstVariable;
        //variable name must be unique

        //Initialization
        firstVariable = 10;
        name = "Priyanshu";

        //Declaration and initialization
        float secondVariable = 20.2f;
        int age = 22;
        float total = firstVariable + secondVariable;

        //using our variables
        System.out.println("firstVariable is " + firstVariable); //concatenation
        System.out.println("secondVariable is " + secondVariable);
        System.out.println("Total is " + total);

        firstVariable = 15; //overlapping variable
        System.out.println("firstVariable is " + firstVariable);
        total = firstVariable + secondVariable;
        System.out.println("Total is " + total);

        System.out.println("My name is " + name);

        //StringTemplate, not available in Java 25 etc
        System.out.printf("Hello, %s. You are %d years old.\n", name, age);


        //Task
        String myName = "Priyanshu";
        int myAge = 22;
        String progLang = "Java";
        System.out.println("My name is " + myName + " and I am " + myAge +
                " years old. I love " + progLang + ".");
    }
}
