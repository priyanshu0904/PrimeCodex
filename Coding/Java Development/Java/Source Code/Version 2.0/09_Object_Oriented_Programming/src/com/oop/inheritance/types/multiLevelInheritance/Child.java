package com.oop.inheritance.types.multiLevelInheritance;

public class Child extends Parent{
    public int property3;
    public void method3(){
        System.out.println("Child");
    }
    Child(){
        property2 = 29;
        method2();
        property = 9;
        method();
    }

    //Multi-Level inheritance, Grandparent->parent->child
    //child inherits property of both
}
