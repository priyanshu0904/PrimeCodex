package multithreading.Join;

public class Test {
    static void main(String[] args) throws InterruptedException {
        ThreadJoin t1 = new ThreadJoin(1);
        ThreadJoin t2 = new ThreadJoin(2);
        ThreadJoin t3 = new ThreadJoin(3);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
