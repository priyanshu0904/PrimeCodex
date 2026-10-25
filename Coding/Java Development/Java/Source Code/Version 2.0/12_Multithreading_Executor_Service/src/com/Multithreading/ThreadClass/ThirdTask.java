package com.Multithreading.ThreadClass;

public class ThirdTask extends Thread{
    //creating third thread

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\n# Task Complete");
        System.out.printf("\n%s # task complete", Thread.currentThread().getName());

    }
}
