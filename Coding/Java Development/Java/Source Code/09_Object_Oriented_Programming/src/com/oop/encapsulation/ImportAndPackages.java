package com.oop.encapsulation;
//package is java namespace, organizes class and interfaces, prevent naming conflicts, helps in avoiding name collisions by categorizing similar classes together
//declared in the beginning or top of file, package keyword and package name
//naming convention -> use your website name in the reverse manner

import java.util.Scanner; //single-type import -> imports only one class from package
import java.util.*; //on-demand import -> imports all classes from package

import com.oop.demo.Encapsulation;
//import is used to bring classes and interfaces from other packages to current fie, making them accessible without using a fully qualified name

//no need import in same package

public class ImportAndPackages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        com.oop.demo.Encapsulation imp = new com.oop.demo.Encapsulation();
        imp.test();

        //java.util, java.io etc. are built-in java packages
        //java.lang -> built-in, but automatically imported
        //com.oop.demo etc are user-defined packages

        //no need to import in same package
    }
}
