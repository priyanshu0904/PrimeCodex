package com.Multithreading.JoinMethod;

public class Test {
    static void main(String[] args) throws InterruptedException{
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        //p1.start(); //in Runnable interface there is only one method, run()

        long start = System.currentTimeMillis();

        //actual object of my thread
        Thread t1 = new Thread(p1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        System.out.println("\nThread 0 Started");
        Thread t2 = new Thread(p2);
        t2.setPriority(Thread.NORM_PRIORITY);
        //t2.setPriority(5);
        t2.start();
        System.out.println("\nThread 1 Started");

        //with join() method, only calling thread will stop executing till the completion of thread with join(), not all threads
        t1.join(); //main method will wait till t1 completes
        System.out.println("\nFirst Thread Completed");
        t2.join(1000); //it waits till specified time in ms, then die
        System.out.println("\nSecond Thread Completed");
        Thread t3 = new Thread(p3);
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start(); //t3 is in main thread, so main thread stops till t2.join(), after that t3 will start
        System.out.println("\nThread 2 Started");
        t3.join(100,500); //waits till specified ms plus nanos

        long end = System.currentTimeMillis();
        System.out.printf("\n%s Thread Total time taken: %d ms\n", Thread.currentThread().getName(),(end - start));
    }
}
