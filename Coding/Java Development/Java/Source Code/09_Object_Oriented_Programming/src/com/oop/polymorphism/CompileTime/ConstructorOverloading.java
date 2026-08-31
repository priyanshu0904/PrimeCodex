package com.oop.polymorphism.CompileTime;

public class ConstructorOverloading {

    ConstructorOverloading(){
        System.out.println("Default Constructor Called");
    }

    ConstructorOverloading(String pop){
        System.out.println(pop);
    }

    static void main(String[] args) {
        ConstructorOverloading c1 = new ConstructorOverloading();
        ConstructorOverloading c2 = new ConstructorOverloading("Priyanshu");
    }

}
