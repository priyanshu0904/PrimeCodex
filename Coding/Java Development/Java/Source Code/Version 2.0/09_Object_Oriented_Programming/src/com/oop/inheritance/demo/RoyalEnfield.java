package com.oop.inheritance.demo;

import com.oop.inheritance.basics.Vehicle;

public class RoyalEnfield extends Vehicle {
    RoyalEnfield(){
        tyres = 8;//protected, but can use for its child in different package
        //protected is only used or made for inheritance, to access the superclass members to subclass members
        noOfWheels = 9; //public
    }
}
