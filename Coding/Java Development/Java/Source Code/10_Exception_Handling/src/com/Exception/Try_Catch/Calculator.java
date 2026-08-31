package com.Exception.Try_Catch;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator...");
        System.out.print("Please enter your two numbers: ");
        int first = sc.nextInt();
        int second = sc.nextInt();

        try {
            int[] array = new int[5];
            //System.out.printf("Division is %d", array[5]);
            array[5] = first / second;
            //int result = first / second;
            System.out.printf("Division is %d", array[5]);
        } catch (ArithmeticException exception){
            System.out.printf("%s, enter valid values",
                    exception.getMessage());
        } catch (ArrayIndexOutOfBoundsException excp){
            System.out.println("Array is out of Bound");
        } catch (Throwable th){
            System.out.printf("%s", th.getMessage());
        }
    }
}