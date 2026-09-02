package com.Multithreading.JoinMethod;

public class Test {
    static void main(String[] args) throws InterruptedException{
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        //p1.start(); //in Runnable interface there is only one method, run()

        long start = System.currentTimeMillis();

        Thread t1 = new Thread(p1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        System.out.println("\nThread 0 Started");
        Thread t2 = new Thread(p2);
        t2.setPriority(Thread.NORM_PRIORITY);
        //t2.setPriority(5);
        t2.start();
        System.out.println("\nThread 1 Started");

        t1.join();
        t2.join(10);
        Thread t3 = new Thread(p3);
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();
        System.out.println("\nThread 2 Started");

        long end = System.currentTimeMillis();
        System.out.printf("\n%s Thread Total time taken: %d ms\n", Thread.currentThread().getName(),(end - start));
    }
}
