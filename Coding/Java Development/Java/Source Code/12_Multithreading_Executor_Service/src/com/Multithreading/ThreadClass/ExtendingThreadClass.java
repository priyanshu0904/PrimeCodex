package com.Multithreading.ThreadClass;

import java.util.Set;

public class ExtendingThreadClass {
    static void main(String[] args) {
        long start = System.currentTimeMillis();
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();
        FirstTask t4 = new FirstTask();

        System.out.println("\nStarting First Thread");
        t1.start(); //starting first thread
        System.out.println("\nStarting Second Thread");
        t2.start(); //starting second thread
        System.out.println("\nStarting Third Thread");
        t3.start(); //starting third thread
        System.out.println("\nStarting Fourth Thread");
        t4.start(); //starting fourth thread

        //all the threads are started simultaneously
        //execute independently and print values, depends on cpu core availability

        long end = System.currentTimeMillis();
        System.out.printf("\n%s Thread Total time taken: %d ms\n", Thread.currentThread().getName(),(end - start));
    }
}
