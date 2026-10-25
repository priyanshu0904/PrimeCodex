package com.Collections.CollectionsLibrary.CollectionInterface.SetInterface;

import com.Collections.CollectionsLibrary.CollectionInterface.Utility;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    //doesn't allow duplicate, all unique elements
    //unordered collection, doesn't guarantee any specific ordering
    //doesn't support indexing-based access

    //HashSet, LinkedHashSet, TreeSet

    static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(set.add("Priyanshu")); //adds specified element to the set
        System.out.println(set.add("Priya"));
        System.out.println(set.add("Pallavi"));
        Utility.print(set);

        System.out.println(set.add("Priyanshu"));
        System.out.println(set.size()); //returns the number of elements in the set
        Utility.print(set);

        System.out.println(set.contains("Priya")); //checked if the set contains specified element
        System.out.println(set.remove("Priya")); //removes the specified element from the set
        Utility.print(set);

        System.out.println(set.remove("Priya"));
        System.out.println(set.isEmpty()); //checks if the set is empty
    }
}
