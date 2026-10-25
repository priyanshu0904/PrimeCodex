package com.Multithreading.Synchronize;

public class NewUpdaterThread extends Thread{
    private final CounterWithSynchronized counter;

    public NewUpdaterThread(CounterWithSynchronized counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
