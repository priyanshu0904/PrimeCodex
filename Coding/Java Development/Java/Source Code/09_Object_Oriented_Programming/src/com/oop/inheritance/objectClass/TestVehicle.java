package com.oop.inheritance.objectClass;

public class TestVehicle {
    public static void main(String[] args) {
        BMW bmw = new BMW();

        //these are the methods of Object class
        System.out.println(bmw.toString());
        System.out.println(bmw.hashCode());
        System.out.println(bmw.getClass());
    }
}
