package com.Multithreading.ThreadCommunication.Sleep;

public class Sleep {
    static void main(String[] args) throws InterruptedException {
        System.out.println("Before Sleeping");
        Thread.sleep(10000); //static method
        System.out.println("Woke up");
    }
}
