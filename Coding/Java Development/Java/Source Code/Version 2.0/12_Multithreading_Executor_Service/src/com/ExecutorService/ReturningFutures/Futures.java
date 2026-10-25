package com.ExecutorService.ReturningFutures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Futures {
    static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        FetchName name1 = new FetchName("Priyanshu");
        FetchName name2 = new FetchName("Raj");
        FetchName name3 = new FetchName("Priya");
        FetchName name4 = new FetchName("Alok");

        //save the result in a Future variable
        Future<String> pr1 = service.submit(name1);
        Future<String> pr2 = service.submit(name2);
        Future<String> pr3 = service.submit(name3);
        Future<String> pr4 = service.submit(name4);

        System.out.printf("Full name is: %s\n", pr1.get());
        System.out.printf("Full name is: %s\n", pr2.get());
        System.out.printf("Full name is: %s\n", pr3.get());
        System.out.printf("Full name is: %s\n", pr4.get());

        service.shutdown();
    }
}
