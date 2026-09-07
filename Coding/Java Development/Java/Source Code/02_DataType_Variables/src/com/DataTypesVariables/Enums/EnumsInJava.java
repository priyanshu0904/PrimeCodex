package com.DataTypesVariables.Enums;

public class EnumsInJava {
    public static void main(String[] args) {
        enum Days {
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        }

        enum State {
            ON, OFF;
        }

        System.out.println(State.ON);
        System.out.println(Days.THURSDAY);

        State s1 = State.ON;
        State s2 = State.OFF;

        //Methods
        //name()
        System.out.println("Name of s1: " + s1.name()); //name associated with d1

        //values()
        System.out.println("Value at 1: " + State.values()[1]); //converted to array and can access by index

        //valueOf()
        State s3 = State.valueOf("ON"); //sets the value of s3, must be from enum
        System.out.println("Value of ON is " + s3);

        //ordinal()
        System.out.println(s1.ordinal());
        System.out.println(s3.ordinal());
    }
}
