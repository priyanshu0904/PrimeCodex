package com.Enums;

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
        System.out.println("Name of s1: " + s1.name());

        //values()
        System.out.println("Value at 1: " + State.values()[1]);

        //valueOf()
        State s3 = State.valueOf("ON");
        System.out.println("Value of ON is " + s3);

        //ordinal()
        System.out.println(s1.ordinal());
    }
}
