package com.oop.inheritance.types.hierarchicalInheritance;

public class FirstChild extends Parent{
    int property2;
    void method2(){
        System.out.println("Mai pehla bachha hu.");
    }

    FirstChild(){
        property = 2;
        method();
    }

    //first child inherits from parent class
}
