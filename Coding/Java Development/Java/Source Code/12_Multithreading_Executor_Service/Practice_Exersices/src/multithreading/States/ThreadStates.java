package multithreading.States;

public class ThreadStates extends Thread{
    @Override
    public void run() {
        //we can not do throws in run, as this is overridden method
        try {
            Thread.sleep(4000);
            System.out.printf("From inside run %s\n", getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
