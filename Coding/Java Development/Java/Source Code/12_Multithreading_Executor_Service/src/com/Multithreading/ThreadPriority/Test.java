package com.Multithreading.ThreadPriority;

public class Test {
    static void main(String[] args) {
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        //p1.start(); //in Runnable interface there is only one method, run()
        //start() is the property of thread

        long start = System.currentTimeMillis();

        //priority levels from 1-10(Highest), default = 5
        //it only suggests the importance level of thread, not guaranteed the order of execution is same
        Thread t1 = new Thread(p1);
        t1.setPriority(Thread.MIN_PRIORITY); //method to set priority level
        t1.start();
        System.out.println(t1.getPriority()); //method to get priority of thread
        Thread t2 = new Thread(p2);
        t2.setPriority(Thread.NORM_PRIORITY);
        //t2.setPriority(5);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();

        long end = System.currentTimeMillis();
        System.out.printf("\n%s Thread Total time taken: %d ms\n", Thread.currentThread().getName(),(end - start));
    }
}
