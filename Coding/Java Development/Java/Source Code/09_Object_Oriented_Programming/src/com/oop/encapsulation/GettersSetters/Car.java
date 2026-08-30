package com.oop.encapsulation.GettersSetters;

public class Car {
    private String color; //want public access
    private String model; //want public access
    private double fuelLevel; //private is ok
    private long costOfPurchase; //want default access

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public String getColor(){
        return color;
    }

    void setColor(String color){
        if(color.equals("Yellow")){
            System.out.println("Pagleeee");
            return;
        }
        this.color = color;
    }

    public String getModel(){
        return model;
    }

    long getCostOfPurchase(){
        return costOfPurchase;
    }

    //can use generate -> getter setter in IDE
    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
