package com.Multithreading.ThreadCommunication.Sleep;

public class Sleep {
    static void main(String[] args) throws InterruptedException {
        System.out.println("Before Sleeping");
        long start = System.currentTimeMillis();
        Thread.sleep(10000); //static method, currently executing thread to sleep(temporarily cease execution) for specified time
        long end = System.currentTimeMillis();
        System.out.println("Woke up after " + (end - start) + " ms");
    }
}
