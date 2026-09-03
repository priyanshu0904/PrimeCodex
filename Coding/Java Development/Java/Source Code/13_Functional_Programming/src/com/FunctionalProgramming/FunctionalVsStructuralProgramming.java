package com.FunctionalProgramming;

import javax.swing.*;
import java.util.List;

public class FunctionalVsStructuralProgramming {
//    #Programming Paradigms
//    Imperative Programming:
//        1. Procedural Programming
//        2. Structured Programming
//        3. Object-Oriented Programming
//    Declarative Programming:
//        1. Functional Programming
//        2. Logic Programming

    //Structural: Step-by-step long programs, have complete control
    //Functional: Set condition to trigger program to produce desired result, less control, short programs
    static void main(String[] args) {
        int sum= 0;
        for(int i = 0; i < 10; i++){
            sum += (i+1);
        }
        System.out.println(sum);

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        int add = nums.stream().reduce(0, (a, b) -> a + b);
        System.out.println(add);
    }
}
