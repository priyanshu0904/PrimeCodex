package com.FunctionalProgramming.LambdaExpression;

public class Lambda {
    static void main(String[] args) {
        Lambda test = new Lambda();
        System.out.println("Sum is: " + test.sun(5,8));
        test.printString("Hello Priyanshu");

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
    }

    private void printString(String toPrint){
        System.out.println(toPrint);
    }

    private int sun(int a, int b){
        return a+b;
    }
}
