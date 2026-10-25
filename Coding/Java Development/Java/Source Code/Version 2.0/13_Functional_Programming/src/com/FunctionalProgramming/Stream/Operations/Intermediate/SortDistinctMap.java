package com.FunctionalProgramming.Stream.Operations.Intermediate;

import java.util.List;
import java.util.stream.Collectors;

public class SortDistinctMap {
    static void main(String[] args) {
        List<Integer> list = List.of(4,5,1,3,2);
        List<Integer> newList = list.stream()
                .sorted() //to sort all the elements of stream
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(newList);

        List<String> str = List.of("Apple", "Banana", "Guava", "Apple", "apple", "mango");
        List<String> newStr = str.stream()
                .distinct() //only distinct values can pass
                .collect(Collectors.toList());
        System.out.println(str);
        System.out.println(newStr);

        List<String> newestStr = str.stream()
                .map(s -> s.toUpperCase()) //transforms into a new stream with such function implemented
                .collect(Collectors.toList());
        System.out.println(newestStr);
    }
}
