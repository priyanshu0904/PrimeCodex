package com.Multithreading.Synchronize;

public class CounterWithSynchronized {
    private int count = 0;

    //synchronized keyword, mutual exclusion in threads, only one thread can access at a time
    //Object lock, no other thread can enter in this
    //Visibility, changes made by one thread to shared data and visible to all other threads
    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
