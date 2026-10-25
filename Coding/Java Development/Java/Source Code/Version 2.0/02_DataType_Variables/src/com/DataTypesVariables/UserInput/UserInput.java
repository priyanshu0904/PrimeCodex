package com.DataTypesVariables.UserInput;

import java.util.Scanner; //this must be added

public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //Object of Scanner class
        System.out.print("Enter your Name: ");
        String name = sc.nextLine(); //to take string
        System.out.println("Good Morning " + name);

        System.out.print(name + " enter your age: ");
        int age = sc.nextInt(); //to take integer
        System.out.println("Your age is " + age); //concatenation

        //next() -> for one character or word
        System.out.print("Enter word or character: ");
        String str = sc.next(); //to take character or single word
        System.out.println(str);

        //Triple quotes, pre-formatted string
        //Java will consider it as it is
        System.out.println("""
                1. Option 1
                2. Option 2
                3. Option 3
                .....
                """);

    }
}
