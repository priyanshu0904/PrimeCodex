package com.Exception.ThrowAndThrows;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) throws Throwable{
        //throws keyword -> declared that a method may throw one or more exception, throw clause used in method declaration
        //used in method signature to indicate that method might throw exceptions of specific types, can declare multiple exceptions separated by comma
        //a method declared with throws requires the calling methodto handle or further declare exception
        a();
    }

    private static void a() throws Throwable{
        b();
    }

    private static void b() throws Throwable{
        c();
    }

    private static void c() throws Throwable{
        d();

    }

    private static void d() throws Throwable{
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
        } catch (ArrayIndexOutOfBoundsException excp){
            System.out.println("Array is out of Bound");
        } catch (Throwable th){
            System.out.printf("%s", th.getMessage());
            System.out.println();
            throw th;
        }
        //throw keyword is used to explicitly throw an exception from any method or block of code, it is used inside method
        //can throw a new instance of exception or an existing exception object, can throw only one exception
        //throw new ArithmeticException("Division by zero");

        //a function throws an exception to its calling function, and the calling function to its calling function
        //so on to main method, main method error handled by JVM


        //Throw trace
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at com.Exception.ThrowAndThrows.Calculator.d(Calculator.java:36)
//        at com.Exception.ThrowAndThrows.Calculator.c(Calculator.java:22)
//        at com.Exception.ThrowAndThrows.Calculator.b(Calculator.java:18)
//        at com.Exception.ThrowAndThrows.Calculator.a(Calculator.java:14)
//        at com.Exception.ThrowAndThrows.Calculator.main(Calculator.java:10)
//
//        Process finished with exit code 1 //1 because code failure, if success then 0

        //a call stack made in function calling, and throws error to its calling one
    }
}
