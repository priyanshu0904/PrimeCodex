package com.JavaBasics.Basics;

public class HelloNewJava {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }

    //In terminal
    //javac HelloNewJava.java
    //java HelloNewJava 1 2 3
    //It will print 1 2 3, as these are arguments we are passing to main method
}
