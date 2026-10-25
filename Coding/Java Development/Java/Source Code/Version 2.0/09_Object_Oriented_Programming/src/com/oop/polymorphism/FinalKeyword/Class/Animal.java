package com.oop.polymorphism.FinalKeyword.Class;

public final class Animal {
    //a final class can not be subclassed, no inherit, securing to be extended
    public void sound(){
        System.out.println("Animal makes some sound");
    }
}
