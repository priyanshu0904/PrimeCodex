package com.Recursion;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Welcome to PrimeCodex Factorial Generator...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = sc.nextInt();

        long factorialIterative = factorialIterative(num);
        System.out.println("Factorial of " + num + " using iteration is: " + factorialIterative);
        long factorialRecursion = factorialRecursion(num);
        System.out.println("Factorial of " + num + " using recursion is: " + factorialRecursion);

    }

    public static long factorialIterative(int num){
        long result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }

    public static long factorialRecursion(int num){
        //stack, problem divisible into similar smaller problem, not vice-versa
        System.out.println("Function called for " + num);
        if(num == 0 || num == 1){ //base case -> to stop recursion and prevent infinite loops
            return 1;
        }else{
            //recursive call or self calling function, this is recursive case where the function make recursive call
            return num * factorialRecursion(num - 1);
        }

        //if function call itself too much then it can cause stack overflow error
        //iteration is faster than recursion
    }
}
