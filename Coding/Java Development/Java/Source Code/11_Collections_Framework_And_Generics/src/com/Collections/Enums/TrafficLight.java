package com.Collections.Enums;

public enum TrafficLight {
    RED("Stop"), GREEN("Go"), YELLOW("Cautions");

    private final String action;

    TrafficLight(String action) {
        this.action = action;
    }
}
