package com.FunctionalProgramming.OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList();
        Optional<Integer> add = list.stream()
                .reduce((a,b) -> a+b);
        if(add.isPresent()){ //checks if the value present or not
            System.out.println(add.get());
        }else {
            System.out.println("List is Empty");
        }

        Optional<String> optionalEmpty = Optional.empty(); //assigns nothing
        Optional<String> optionalOf = Optional.of("Priyanshu"); //assigns a value
        Optional<String> optionalNullable = Optional.ofNullable(null); //assigns null

        if(optionalOf.isPresent()){
            System.out.println("Value is present: " + optionalOf.get());
        }

        String orElseExample = optionalEmpty.orElse("Default Value"); //if not present then print orElse
        System.out.println("Using orElse: " + orElseExample);

        optionalOf.ifPresent(System.out::println); //checks if present, then do specified work
        optionalNullable.ifPresent(System.out::println);
    }
}
