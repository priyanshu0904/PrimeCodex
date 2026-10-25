package functionalProgramming.streams;

import java.util.function.BinaryOperator;

public class MultiplicationUsingLambda {
    static void main(String[] args) {
        BinaryOperator<Integer> multiple = (a, b) -> a * b;
        int result = multiple.apply(4,8);
        System.out.println(result);
    }
}
