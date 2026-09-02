package executorServices.Factorial;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {

    private final int number;

    public Factorial(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        if(number <= 1){
            return number;
        }
        int result = 1;
        for (int i = 2; i <= number ; i++) {
            result *= i;
        }
        return result;
    }
}
