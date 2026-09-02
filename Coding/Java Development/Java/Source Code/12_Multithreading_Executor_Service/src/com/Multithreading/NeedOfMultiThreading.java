package com.Multithreading;

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

        long end = System.currentTimeMillis();
        System.out.printf("Total time taken: %d ms", (end - start));
    }
}
