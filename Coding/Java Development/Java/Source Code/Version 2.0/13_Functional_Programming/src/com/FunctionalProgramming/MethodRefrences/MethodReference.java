package com.FunctionalProgramming.MethodRefrences;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class MethodReference {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //using method reference, :: used
        list.stream()
                .filter(num -> num % 2 == 1)
                .forEach(System.out::println);

        list.stream()
                .filter(num -> num % 2 == 1)
                .forEach(num -> System.out.println(num));

        int add = list.stream()
                .reduce(0, Integer::sum); //method reference example
        System.out.printf("Sum using lambda and reduce is %d\n", add);

        List<String> list1 = List.of("Priyanshu", "Raj");
        list1.stream()
                .map(s -> s.toLowerCase())
                .forEach(s -> System.out.println(s));

        list1.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        BinaryOperator<Integer> max = (a,b) -> a > b ? a : b;
        System.out.println(max.apply(10, 20));

        BinaryOperator<Integer> min = Integer::min;
        System.out.println(min.apply(10,20));
    }
}
