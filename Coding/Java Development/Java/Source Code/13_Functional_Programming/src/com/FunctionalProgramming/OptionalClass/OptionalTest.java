package com.FunctionalProgramming.OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList();
        Optional<Integer> add = list.stream()
                .reduce((a,b) -> a+b);
        if(add.isPresent()){
            System.out.println(add.get());
        }else {
            System.out.println("List is Empty");
        }
    }
}
