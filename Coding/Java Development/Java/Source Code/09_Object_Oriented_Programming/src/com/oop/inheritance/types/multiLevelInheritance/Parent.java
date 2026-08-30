package com.oop.inheritance.types.multiLevelInheritance;

public class Parent extends GrandParent{
    public int property2;
    public void method2(){
        System.out.println("Parent");
    }

    Parent(){
        property = 9;
        method();
    }
}
