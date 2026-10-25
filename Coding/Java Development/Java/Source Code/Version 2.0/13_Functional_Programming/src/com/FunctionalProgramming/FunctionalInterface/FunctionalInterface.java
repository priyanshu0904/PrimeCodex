package com.FunctionalProgramming.FunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterface {
    //Single Abstract Method(SAM)
    //Lambda Capability
    //@FunctionalInterface annotation
    //Predicate, Consumer, BinaryOperator, Runnable, Callable, Comparator and user-defined interface with one abstract method only

    static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(8));

        Consumer<String> print = message -> System.out.println(message);
        print.accept("Priyanshu becomes an Engineer");

        BinaryOperator<Integer> multiply = (a, b) -> a*b;
        System.out.println(multiply.apply(8, 7));
    }
}
