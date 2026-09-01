package com.Collections.CollectionsLibrary.CollectionInterface.ListInterface;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List strList = new ArrayList(); //upcasting
        strList.add("Priyanshu");
        strList.add("Raj");
        strList.add(1, "Prince");
        strList.remove(0);
        strList.add(55); //we are adding any type of thing in list
        if(strList.contains("Raj")){ //exact match
            System.out.println(strList.indexOf("Raj"));
            System.out.println("Exists");
        }
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        //must be wrapper class, can't use primitive types
        List<Integer> myInt = new ArrayList<>();
        //<Integer> this is known as generics, it is only used at compile-time, at run-time it is removed

        myInt.add(55);
        myInt.add(56);
        myInt.add(1, 26);
        //myInt.add("Priyanshu"); //String type
        for (int i = 0; i < myInt.size(); i++) {
            System.out.println(myInt.get(i));
        }

        //both loop can be used
        for (int i : myInt){
            System.out.println(i * 2);
        }

        //Can be of any wrapper class
        List<String> newStr = new ArrayList<>();
        newStr.add("Priyanshu");
        System.out.println(newStr.get(0));
    }
}
