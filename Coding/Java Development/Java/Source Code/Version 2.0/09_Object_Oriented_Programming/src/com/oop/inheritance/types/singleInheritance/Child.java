package com.oop.inheritance.types.singleInheritance;

public class Child extends Parent{
    public int property2;
    Child(){
        property = 22;
        method();
    }

    //Single Inheritance, one parent one child

    static void main(String[] args) {
        Child ch = new Child();
    }
}
