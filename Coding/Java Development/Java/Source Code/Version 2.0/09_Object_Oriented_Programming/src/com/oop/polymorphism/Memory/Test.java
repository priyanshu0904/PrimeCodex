package com.oop.polymorphism.Memory;

public class Test {
    static void main(String[] args) {
        int x = 15;
        int y = 20;
        int sum = PassByValue.add(x, y);
        System.out.printf("x = %d, y = %d, sum = %d\n", x,y, sum);

        PassByReference.Point point = new PassByReference.Point(5,7);
        System.out.println("first: " + point);
        PassByReference.move(point);
        System.out.println("first: " + point);

    }
}
