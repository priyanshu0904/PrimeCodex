package com.FunctionalProgramming.Stream.Operations.Intermediate;

import java.util.List;
import java.util.function.Consumer;

public class Filter {
    //lazy operation
    static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Cherry", "Guava", "mango");
        System.out.println(fruits.size());

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Printing fruits using streams");
        //using Consumer interface
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });
        //there is only one method in Consumer interface which is not implemented
        //so we can write lambda

        System.out.println("Printing fruits using lambda");
        fruits.stream().forEach(fruit -> System.out.println(fruit));

        //now using some filters
        System.out.println("Printing fruits using filter");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("a")) //returns stream after filtering out old stream with specific condition
                .forEach(fruit -> System.out.println(fruit));
                //this is like chaining
    }
}
