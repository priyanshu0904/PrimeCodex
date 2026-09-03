package com.FunctionalProgramming.Stream;

import java.util.List;
import java.util.stream.Stream;

public class Streams {
    static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Cherry", "Guava", "mango");

        Stream<String> stream = fruits.stream(); //sequence of elements of fruits
        //don't store data, process it on-the-fly, can be lazy operations
        //one time usable, manages threads automatically for parallel processing
        stream.forEach(str -> System.out.println(str)); //lambda function inside forEach

        //stream source -> intermediate operations -> termination operation -> operation result
    }
}
