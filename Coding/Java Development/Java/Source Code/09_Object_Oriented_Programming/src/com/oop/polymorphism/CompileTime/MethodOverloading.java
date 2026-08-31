package com.oop.polymorphism.CompileTime;

public class MethodOverloading {
    public int add(int a, int b){
        return a + b;
    }

    public String add(String a, String b){
        return a + b;
    }

    public double add(double a, int b, int c){
        return a + b + c;
    }

    static void main(String[] args) {
        MethodOverloading ov = new MethodOverloading();
        System.out.println(ov.add(5,7));
        System.out.println(ov.add(1,5,88)); //automatic type casting
        System.out.println(ov.add("Priyanshu", "Raj"));
        ov.add("Hey", "EveryOne");

    }
}
