package com.Collections.CollectionsLibrary.CollectionInterface.SetInterface;

import com.Collections.CollectionsLibrary.CollectionInterface.Utility;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(set.add("Priyanshu"));
        System.out.println(set.add("Priya"));
        System.out.println(set.add("Pallavi"));
        Utility.print(set);

        System.out.println(set.add("Priyanshu"));
        System.out.println(set.size());
        Utility.print(set);

        System.out.println(set.contains("Priya"));
        System.out.println(set.remove("Priya"));
        Utility.print(set);

        System.out.println(set.remove("Priya"));
    }
}
