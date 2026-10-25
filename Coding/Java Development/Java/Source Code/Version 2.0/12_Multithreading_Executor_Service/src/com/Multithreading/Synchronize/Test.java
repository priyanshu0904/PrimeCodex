package com.Multithreading.Synchronize;

public class Test {
    static void main(String[] args) {
        long start = System.currentTimeMillis();
        Counter counter = new Counter();
        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

        try{
            t1.start();
            t2.start();
            t1.join();
            t2.join();

//            t1.start();
//            t1.join();
//            t2.start();
//            t2.join();
        }catch (InterruptedException e){
            System.out.println("Thread Interrupted: " + e.getMessage());
        }

        long end = System.currentTimeMillis();
        System.out.printf("Final counter value is %d and time taken is %d ms\n", counter.getCount(), (end - start));

        System.out.println("Thread with synchronized method");

        long startTime = System.currentTimeMillis();
        CounterWithSynchronized ctr = new CounterWithSynchronized();
        NewUpdaterThread t3 = new NewUpdaterThread(ctr);
        NewUpdaterThread t4 = new NewUpdaterThread(ctr);

        try{
            t3.start();
            t4.start();
            t3.join();
            t4.join();

//            t3.start();
//            t3.join();
//            t4.start();
//            t4.join();
        }catch (InterruptedException e){
            System.out.println("Thread Interrupted: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis();
        System.out.printf("Final counter value is %d and time taken is %d ms\n", ctr.getCount(), (endTime - startTime));
    }
}
