package com.oop.polymorphism.FinalKeyword.Class;

public class Test {
    static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.bark();
    }
}
