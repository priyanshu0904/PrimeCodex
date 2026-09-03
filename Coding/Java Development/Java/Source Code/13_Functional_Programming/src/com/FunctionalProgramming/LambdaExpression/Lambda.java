package com.FunctionalProgramming.LambdaExpression;

import java.util.List;

public class Lambda {
    //shortcuts to write functions, makes code shorter
    static void main(String[] args) {
        Lambda test = new Lambda();
        System.out.println("Sum is: " + test.sun(5,8));
        test.printString("Hello Priyanshu");

        //syntax: (parameters) -> {body}
        //Functional Interface, only have one method
        //Lambda expressions
//        () -> System.out.println("Hello");
//
//        toPrint -> System.out.println(toPrint);
//
//        (a,b) -> a + b;
//
//        (int m, int n) ->  m+n;
//
//        (Float x, Float y) -> x + y;
//
//        (c, d) -> {
//            int sum = c+d;
//            System.out.println(sum);
//            return sum;
//        }

        List<String> list = List.of("Priyanshu", "Raj", "Gupta");
        List<String> newList = list.stream()
                .filter(str -> str.endsWith("u")) //Lambda function
                .toList();
        System.out.println(newList);
    }

    private void printString(String toPrint){
        System.out.println(toPrint);
    }

    private int sun(int a, int b){
        return a+b;
    }
}
