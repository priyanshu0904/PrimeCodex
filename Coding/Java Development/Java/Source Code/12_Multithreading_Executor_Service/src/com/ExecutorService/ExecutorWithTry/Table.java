package com.ExecutorService.ExecutorWithTry;

import java.util.concurrent.TimeUnit;

public class Table implements Runnable{
    private final int number;

    public Table(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%d X %d is %d\n", number, i, number*i);
        }
    }
}
