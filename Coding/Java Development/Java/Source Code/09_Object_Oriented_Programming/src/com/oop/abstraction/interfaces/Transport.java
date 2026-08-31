package com.oop.abstraction.interfaces;

public interface Transport {
    //interfaces primarily declare abstract methods for implementation by classes
    //class can implement multiple interfaces, allowing flexibility, multiple inheritance, separated by comma
    //interface keyword is used
    //interface can have default methods with implementation and static methods
    //interface methods are inherently public and abstract, expect for default and static

    public abstract void getSetGo();
    //by default all the methods must be public abstract type in interfaces, so you can also write it as
    void addFuel();
}
