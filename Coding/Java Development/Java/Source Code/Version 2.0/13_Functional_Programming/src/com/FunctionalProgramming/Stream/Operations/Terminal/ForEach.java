package com.FunctionalProgramming.Stream.Operations.Terminal;

import java.util.List;

public class ForEach {
    static void main(String[] args) {
        List<String> arr = List.of("Priyanshu", "Raj", "Gupta");
        arr.stream()
                .forEach(str -> System.out.println(str));
    }
}
