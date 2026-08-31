package com.Exception.ThrowAndThrows;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) throws Throwable{
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


        //Throw trace
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at com.Exception.ThrowAndThrows.Calculator.d(Calculator.java:32)
//        at com.Exception.ThrowAndThrows.Calculator.c(Calculator.java:19)
//        at com.Exception.ThrowAndThrows.Calculator.b(Calculator.java:15)
//        at com.Exception.ThrowAndThrows.Calculator.a(Calculator.java:11)
//        at com.Exception.ThrowAndThrows.Calculator.main(Calculator.java:7)
//
//        Process finished with exit code 1 //1 because code faliure, if success then 0

    }
}
