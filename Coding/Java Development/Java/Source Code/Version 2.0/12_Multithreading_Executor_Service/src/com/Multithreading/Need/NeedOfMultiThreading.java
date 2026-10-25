package com.Multithreading.Need;

public class NeedOfMultiThreading {
    static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n* Task Complete");

        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\n$ Task Complete");

        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\n# Task Complete");

        //All the three tasks are independent of each other, multi-cores of cpu can be used
        //or to split bigger task into smaller
        //can use multithreading

        long end = System.currentTimeMillis();
        System.out.printf("Total time taken: %d ms", (end - start));
    }
}
