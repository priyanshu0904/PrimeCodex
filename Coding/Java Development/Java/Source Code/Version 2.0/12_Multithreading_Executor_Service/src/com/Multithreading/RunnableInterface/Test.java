package com.Multithreading.RunnableInterface;

public class Test {
    static void main(String[] args) {
        //creating instances of our thread
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        //p1.start(); //in Runnable interface there is only one method, run()
        //p1 is not a thread actually

        long start = System.currentTimeMillis();

        //have to create thread, this step is important
        Thread t1 = new Thread(p1);
        t1.start(); //starting the thread will actually implement the run method
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();
        //both thread created and started, they will execute independently

        t3.run(); //it is actually running in main thread
        //to start in other thread use start() method

        long end = System.currentTimeMillis();
        System.out.printf("\n%s Thread Total time taken: %d ms\n", Thread.currentThread().getName(),(end - start));
    }
}
