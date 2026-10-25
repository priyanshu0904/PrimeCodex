package com.ExecutorService.ExecutorWithTry;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    static void main(String[] args) {
        Table task = new Table(5);

        try (ExecutorService service = Executors.newSingleThreadExecutor()){
            service.submit(task);
        }
        //if we wrap the ExecutorService in try block
        //there is no need of explicitly shutdown the service
        //it is managed by try itself
    }
}
