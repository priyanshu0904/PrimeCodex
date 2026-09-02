package functionalProgramming.optionalClass;

import java.util.stream.IntStream;

public class Factorial {
    static void main(String[] args) {
        int num = 9;
        System.out.println("Factorial using Structural Programming...");
        System.out.println(factorial(num));

        System.out.println("Factorial using Functional Programming...");
        IntStream.rangeClosed(2, num)
                .reduce((a,b) -> a * b)
                .ifPresent(System.out::println);
    }

    public static int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
