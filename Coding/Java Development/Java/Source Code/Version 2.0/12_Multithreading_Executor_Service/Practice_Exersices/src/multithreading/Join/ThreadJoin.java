package multithreading.Join;

public class ThreadJoin extends Thread{
    private final int threadNo;

    public ThreadJoin(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        System.out.printf("(%s Thread starting at 0 ms- %d\n",
                Thread.currentThread().getName(), threadNo);

        long start = System.currentTimeMillis();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        System.out.printf("(%s Thread ended %d ms- %d\n",
                Thread.currentThread().getName(), (end - start), threadNo);
    }
}
