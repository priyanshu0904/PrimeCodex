package com.Collections.CollectionsLibrary.CollectionInterface.ListInterface;

import com.Collections.CollectionsLibrary.CollectionInterface.Utility;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    //ordered collection or sequence, allows duplicate elements, can access by integer index
    //maintains insertion order of elements, fast random access and quick iteration
    //capacity automatically grows as elements added, preferred over arrays when size is dynamic or unknown

    //ArrayList, LinkedList, Vector

    public static void main(String[] args) {
        //can use without generics, but not recommended
        List strList = new ArrayList(); //upcasting
        strList.add("Priyanshu");
        strList.add("Raj");
        strList.add(1, "Prince");
        strList.remove(0);

        Utility.print(strList);
        strList.add("Ansh");
        Utility.print(strList);
        strList.remove("Ansh"); //remove the first occurrence of the specified element
        Utility.print(strList);

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

        myInt.add(55); //appends the specific element
        myInt.add(56);
        myInt.add(1, 26); //insert at specific position
        myInt.add(55);
        myInt.add(88);
        Utility.print(myInt);
        myInt.remove(2); //removes element from specific index
        Utility.print(myInt);
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
        newStr.add("Raj");
        newStr.add("Gupta");
        newStr.add("Raj");
        System.out.println(newStr.get(2)); //return the element from specified position
        Utility.print(newStr);
        newStr.remove("Raj"); //removed the first occurrence of specified element
        Utility.print(newStr);
        newStr.set(2, "Priya"); //replaces the element at the specified position
        Utility.print(newStr);
        System.out.println(newStr.size()); //returns the number of element

        System.out.println(newStr.contains("Priya")); //returns true if list contains specific element
        newStr.add("Priyanshu");
        Utility.print(newStr);
        System.out.println(newStr.indexOf("Priyanshu")); //returns the index of first occurrence, if not contain then return -1
        System.out.println(newStr.indexOf("Anshu"));

        newStr.clear(); //removes all the elements
        Utility.print(newStr);
    }
}
