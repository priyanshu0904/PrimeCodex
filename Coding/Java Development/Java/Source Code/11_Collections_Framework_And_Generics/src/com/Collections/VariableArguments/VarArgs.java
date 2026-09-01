package com.Collections.VariableArguments;

public class VarArgs {
    static void main(String... args) { //can be used in main method also
        System.out.println(sum(5,6)); //too specific
        System.out.println(sum(new int[]{4, 6})); //can also use by varargs method
        System.out.println(sum(4,6,8,15,22)); //actually it goes in the method like arrays
        System.out.println(sum(1,2,3));
        System.out.println(sum());

        System.out.println(multiply(1,2));
        System.out.println(multiply(1,5,8,9,10));
        //System.out.println(multiply()); //error, minimum 2 required
    }

    public static int sum(int... a){
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static int multiply(int first, int second, int... a){
        //it means minimum two required
        //int... a can't be written at the beginning
        int mul = first * second;
        for (int i : a) {
            mul *= i;
        }
        return mul;
    }

    public static int sum(int a, int b){
        return a + b;
    }

    //wastage of memory
//    public static int sum(int[] a){
//        int sum = 0;
//        for (int i : a) {
//            sum += i;
//        }
//        return sum;
//    }
}
