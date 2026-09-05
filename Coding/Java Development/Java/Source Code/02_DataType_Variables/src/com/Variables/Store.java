package com.Variables;

import java.io.PrintStream;

public class Store {
    public static void main(String[] args) {
        //Variables
        //Declaration
        int a;
        String name;

        //Initialization
        a = 10;
        name = "Priyanshu";

        //Declaration and initialization
        float b = 20.f;
        int age = 22;

        System.out.println(a);
        System.out.println(name);
        System.out.println(b);
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
