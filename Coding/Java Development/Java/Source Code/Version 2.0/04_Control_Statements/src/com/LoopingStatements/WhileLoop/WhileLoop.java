package com.LoopingStatements.WhileLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        //Looping or iterative statements, code block runs till the condition become false
        //To automate repetitive tasks
        //Iterations -> How many time loop runs
        //All the things of loop can be done by all type of loop

        //while -> used for non-standard condition

        int start = 1; //Initialization, only once

        //To print 10 numbers
        while(start <= 100){ //Condition
            System.out.println(start); //Actual work
            start++; //Updation, to avoid infinite loop
        }

        int end = 500;
        while(end >= 200){
            System.out.println(end);
            end -= 1;
        }

        //Can take multiple inputs
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i < 5){
            int inp = sc.nextInt();
            System.out.println("Number is: " + inp);
            i = i + 1;
        }
    }
}
