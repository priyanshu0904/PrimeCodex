package com.Exception.CustomExceptions;

public class Test {
    public static void checkTemp(double temp) throws TemperatureException{
        if(temp < 0 || temp > 40){
            throw new TemperatureException(temp);
        }
        System.out.println("Temperature is normal: " + temp + "C");
    }

    static void main(String[] args) {
        double temp = 50;
        try{
            checkTemp(temp);
        } catch (TemperatureException e){
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Invalid temperature: " + e.getDegrees());
        }
    }
}
