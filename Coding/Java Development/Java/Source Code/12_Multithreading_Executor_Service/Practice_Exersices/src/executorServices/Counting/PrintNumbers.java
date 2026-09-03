package executorServices.Counting;

import java.util.concurrent.TimeUnit;

public class PrintNumbers implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("Number is %d\n", i+1);
        }
    }
}
