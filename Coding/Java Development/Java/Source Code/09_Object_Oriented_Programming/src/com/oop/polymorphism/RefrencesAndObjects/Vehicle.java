package com.oop.polymorphism.RefrencesAndObjects;

public interface Vehicle {
    void start();
    default void print(){
        System.out.println("Hello");
    }
}
