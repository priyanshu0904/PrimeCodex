package com.oop.encapsulation.AccessModifiers;

public class AccessCar {
    public String color;
    public String model;
    private double fuelLevel;
    long costOfPurchase;

    public AccessCar(){
        //default constructor
    }

    public AccessCar(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AccessCar{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append(", costOfPurchase=").append(costOfPurchase);
        sb.append('}');
        return sb.toString();
    }
}
