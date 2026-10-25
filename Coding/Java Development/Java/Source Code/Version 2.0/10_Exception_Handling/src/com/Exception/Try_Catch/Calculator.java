package com.Exception.Try_Catch;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator...");
        System.out.print("Please enter your two numbers: ");
        int first = sc.nextInt();
        int second = sc.nextInt();

        //try block contains the code which is susceptible for exception
        //catch block follows the try block and handles the exception thrown by try block
        //can have multiple catch blocks, for catch block there must be a try block
        //when exception occur in try block, control transferred to catch block where it is handled, no exception, no execution of catch block
        //nested try catch can be possible
        //catch blocks, more specific to less specific, only one will execute
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
            //single catch block can handle multiple exception using | operator or instanceof Keyword
            System.out.println("Array is out of Bound");
        } catch (Throwable th){
            System.out.printf("%s", th.getMessage());
        } finally{
            //always prints
            System.out.println("I am in finally block");
        }
        //finally block, executes after try-catch blocks, used for cleanup operations
        //always run, whether try throws exception or not, whether catch handles it or not
        //it is ideal for closing resources like files or database connections to prevent resource leaks

        //There are some built-in exceptions by java mentioned in this file
    }
}