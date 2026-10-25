package multithreading.States;

public class Test {
    static void main(String[] args) throws InterruptedException {
        ThreadStates t1 = new ThreadStates();
        System.out.println("Created the thread: " + t1.getState());

        t1.start();
        t1.join();

        System.out.println("Finished the thread: " + t1.getState());
    }
}
