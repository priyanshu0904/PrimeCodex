package executorServices.Factorial;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Test {
    static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            List<Future<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                Factorial task = new Factorial(i+1);
                list.add(service.submit(task));
            }

            for(Future<Integer> future : list){
                System.out.printf("\nThe result is %d", future.get());
            }
            service.shutdown();

            if(!service.awaitTermination(1, TimeUnit.SECONDS)){
                System.out.println("\nTERMINATED");
                service.shutdownNow();
            }
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
