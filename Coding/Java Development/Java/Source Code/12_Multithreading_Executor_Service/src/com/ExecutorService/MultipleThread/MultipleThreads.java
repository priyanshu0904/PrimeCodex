package com.ExecutorService.MultipleThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultipleThreads {
    static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);

        PrintTask task1 = new PrintTask('*');
        PrintTask task2 = new PrintTask('$');
        PrintTask task3 = new PrintTask('#');
        PrintTask task4 = new PrintTask('&');
        PrintTask task5 = new PrintTask('%');
        PrintTask task6 = new PrintTask('@');
        PrintTask task7 = new PrintTask('~');

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        service.submit(task4);
        service.submit(task5);
        service.submit(task6);
        service.submit(task7);

        service.shutdown();
        System.out.println("\n*******************1");

        //to finish the tasks in the bounded time
        if (!(service.awaitTermination(10, TimeUnit.SECONDS))){
            System.out.println("\n*******************2");
            service.shutdownNow(); //otherwise terminate that
        }
    }
}
