package multithreading.Greeting;

public class GreetingThread extends Thread{
    private final int threadNo;

    public GreetingThread(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("(%d) %s Hello from Thread %d\n",
                    i+1, Thread.currentThread().getName(), threadNo);
        }
    }
}
