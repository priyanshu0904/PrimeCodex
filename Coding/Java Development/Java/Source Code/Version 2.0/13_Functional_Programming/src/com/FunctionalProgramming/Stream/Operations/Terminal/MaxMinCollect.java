package com.FunctionalProgramming.Stream.Operations.Terminal;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MaxMinCollect {
    static void main(String[] args) {
        List<Integer> list = List.of(4,5,1,3,2);
        Optional<Integer> max = list.stream()
                .max(Integer::compareTo); //largest element in stream
        max.ifPresent(System.out::println);

        Optional<Integer> min = list.stream()
                .min(Integer::compareTo); //smallest element in stream
        min.ifPresent(System.out::println);

        List<String> arr = List.of("Priyanshu", "Raj", "Gupta");
        List<String> newArr = arr.stream()
                .collect(Collectors.toList()); //gather all elements to new List

        System.out.println(newArr);
    }
}
