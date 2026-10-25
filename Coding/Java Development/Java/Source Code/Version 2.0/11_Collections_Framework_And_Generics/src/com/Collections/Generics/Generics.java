package com.Collections.Generics;

import com.Collections.CollectionsLibrary.CollectionInterface.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {
//    Allows us to write flexible and reusable codes by enabling types(classes and interfaces) to be parameters when defining classes, interfaces and methods.
//    Provides compile-time safety by allowing us to enforce that certain objects are of a specific type
//    With generics, no need to cast objects, because type is known
//    Denoted by angle brackets <>, eg. List<String> -> List of strings
//    This is only compile-time thing, at run-time all of them converts to objects

//    Diamond Operator
//    Introduced in Java 7
//    Denoted by <>, nothing inside
//    It allows to infer the type parameter from the context, means from left, simplifying instantiation of generics classes

    static void main(String[] args) {
        List<Double> db = new ArrayList<>();
        //<Double> is the generics here and <> is the diamond operator
        //refers the type from the left one

        db.add(55.5);
        db.add(88.8);
        Utility.print(db);
        Collections.reverse(db);
        Utility.print(db);
    }
}
