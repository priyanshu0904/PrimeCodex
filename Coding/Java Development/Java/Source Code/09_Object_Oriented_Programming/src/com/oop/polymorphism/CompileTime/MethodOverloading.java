package com.oop.polymorphism.CompileTime;

public class MethodOverloading {
    //same class, multiple methods with same name but different parameters
    //difference can be no of parameters, type of parameters, sequence of parameter
    //return type can vary in all methods, but return type alone does not distinguish them
    //Compile-time polymorphism, resolved during compile time
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
        System.out.println(ov.add(7.5f, 8, 7));
        //here we are using float type, so compiler will check for exact match first
        //if not found then float is converted to double by automatic type casting
    }
}
