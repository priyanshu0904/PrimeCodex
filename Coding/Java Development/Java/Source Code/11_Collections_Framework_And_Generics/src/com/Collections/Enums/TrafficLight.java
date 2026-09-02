package com.Collections.Enums;

public enum TrafficLight {
    //enums is a special type for fixed set of constants like days, colors
    //enum keyword is used, values are written separated by comma
    //it is type-safe, readable, it can have methods and fields
    //useful in switch statements and iterating with values() method


    RED("Stop"), GREEN("Go"), YELLOW("Cautions");

    //can call constructor, and have to associate with all the values
    private final String action;

    TrafficLight(String action) {
        this.action = action;
    }
}
