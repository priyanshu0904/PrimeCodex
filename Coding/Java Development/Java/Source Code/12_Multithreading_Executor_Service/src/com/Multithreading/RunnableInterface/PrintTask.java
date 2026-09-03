package com.Multithreading.RunnableInterface;

public class PrintTask implements Runnable{
    //using Runnable interface to creating a thread

    //override run method
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d%c ", i, targetChar);
        }
        System.out.printf("\n%s %c task complete", Thread.currentThread().getName(), targetChar);
    }

    private final char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
}
