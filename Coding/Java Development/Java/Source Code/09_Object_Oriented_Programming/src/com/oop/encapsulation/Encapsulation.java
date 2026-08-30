package com.oop.encapsulation;

import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {
        //Encapsulation -> hides internal data allowing through methods, protects from external interference maintains integrity
        //Uses access modifiers -> public, private, protected, default
        //Uses getters and setters, public methods to control property access
        //enhance modularity -> keep classes separate and reduces coupling

        Scanner sc = new Scanner(System.in);
        com.oop.demo.Encapsulation esc = new com.oop.demo.Encapsulation();
        esc.test();
    }
}
