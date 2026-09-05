package com.ConditionalStatements.SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //Alternate to if-else ladder, only for equality
        //Handles multiple values
        //types in switch -> byte, short, char, int, String, enum, long, double, float
        //Type in case label must be same as switch(type)
        //conditional, decision-making, branching

        System.out.println("Welcome to day finder...\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your day in number...");
        int day = sc.nextInt();
        oldSwitch(day);
        newSwitch(day);

    }

    public static void oldSwitch(int day){
        //wherever the first case true, if no break statements, it prints all the things till end
        switch (day){ //it checks like day == 1 or day == 2 etc, that's why equality only
            case 1: //checks for day == 1 or not
                System.out.println("Monday");
                break;
            //break is used to prevent fall-through in cases
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                //here fall through occur, no break statement
            case 7:
                System.out.println("Holiday");
                break;
            default: //no case matches then this will execute
                System.out.println("Invalid Day...");
                break;
            //In the last one, break is not important, but use it for good practices.
        }
    }

    public static void newSwitch(int day){
        //Enhanced switch
        //no break, store in variable
        //switch can return a value
        String dayStr = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Holiday"; //multiple cases/constants by comma, no fall through logic
            default -> "Invalid Day";
        }; //Semicolon important
        System.out.println(dayStr);
    }
}
