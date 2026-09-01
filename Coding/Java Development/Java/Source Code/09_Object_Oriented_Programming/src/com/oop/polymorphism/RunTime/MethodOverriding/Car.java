package com.oop.polymorphism.RunTime.MethodOverriding;

public class Car extends Vehicle{
    private final int noOfTyres = 5;

    //method overriding occurs when subclass provides a specific implementation of already defined method in superclass
    //@Override Annotation is used, optional but to ensure that method is correctly override
    @Override
    public void start() {
        System.out.println(this.noOfTyres);
        System.out.println("Car is Starting");
        //overridden method must have same name and signature, same name, return type, parameter as the method in parent class
        //access level can not be more restrictive than overridden method's access level
        //like protected method in parent class -> override in child, must have either protected or public
        //not default or private, it kind of increasing restriction
    }
}
