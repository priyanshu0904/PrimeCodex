package com.Exception.CustomExceptions;

public class TemperatureException extends Exception{
    //Custom exception, user-defined exception
    //extends Exception for checked exceptions or RuntimeException for unchecked exceptions
    //used to create or represent specific error condition relevant to an application

    private double degrees;

    public TemperatureException(double degrees) {
        this.degrees = degrees;
    }

    @Override
    public String getMessage() {
        return "The temperature (" + degrees
                + "C) isn't in normal range.";
    }

    public double getDegrees() {
        return degrees;
    }
}
