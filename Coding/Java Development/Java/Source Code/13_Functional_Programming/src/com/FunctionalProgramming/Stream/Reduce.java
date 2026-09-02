package com.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        System.out.println(sum);

        int newSum = list.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });
        System.out.printf("Sum using reduce is %d\n", newSum);

        int add = list.stream()
                .reduce(0, (a,b) -> a+b);
        System.out.printf("Sum using lambda and reduce is %d\n", add);

        int max = list.stream()
                .reduce(Integer.MIN_VALUE, (a,b) ->  a > b ? a : b);
        System.out.printf("Max using lambda and reduce is %d\n", max);

    }
}
