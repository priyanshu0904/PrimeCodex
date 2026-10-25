package executorServices.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(5)) {

            for (int i = 0; i < 10; i++) {
                ThreadPool sleep = new ThreadPool();
                service.submit(sleep);
            }
            service.shutdown();

            if(!service.awaitTermination(5, TimeUnit.SECONDS)){
                System.out.println("EMERGENCY SHUTDOWN");
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
