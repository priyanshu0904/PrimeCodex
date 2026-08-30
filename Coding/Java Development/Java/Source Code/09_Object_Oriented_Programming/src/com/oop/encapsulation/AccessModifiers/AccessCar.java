package com.oop.encapsulation.AccessModifiers;

public class AccessCar {
    public String color; //public - access everywhere
    public String model; //public
    private double fuelLevel; //private - access within defining class only
    long costOfPurchase; //default - access only in same package, no keyword, package-private
    protected int num; //protected - access in same package and in subclass
    //method, constructor, variables can use all the modifiers
    //class -> only public or default

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
