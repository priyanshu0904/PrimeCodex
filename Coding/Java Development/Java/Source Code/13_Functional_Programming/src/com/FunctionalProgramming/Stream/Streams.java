package com.FunctionalProgramming.Stream;

import java.util.List;
import java.util.stream.Stream;

public class Streams {
    static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Cherry", "Guava", "mango");

        Stream<String> stream = fruits.stream();
        stream.forEach(System.out::println); //lambda function inside forEach
    }
}
