package com.UserInput;

import java.util.Scanner; //this must be added

public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //Object of Scanner class
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Good Morning " + name);

        System.out.print(name + " enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is " + age); //concatenation

        //next() -> for one character or word
        System.out.print("Enter word or character: ");
        String str = sc.next();
        System.out.println(str);

    }
}
