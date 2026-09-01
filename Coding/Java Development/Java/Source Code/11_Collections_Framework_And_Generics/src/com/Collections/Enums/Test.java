package com.Collections.Enums;

public class Test {
    static void main(String[] args) {
        TrafficLight color = TrafficLight.RED;
        //color = "Red";
        color = TrafficLight.GREEN;

        Grades grade = Grades.B;
        grade = Grades.valueOf("D");

        for (Grades value : Grades.values()) {
            System.out.println(value);
        }
    }
}
