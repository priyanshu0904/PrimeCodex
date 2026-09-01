package com.Collections.CollectionsLibrary.CollectionInterface;

import java.util.Collection;

public class Utility {
    public static <E> void print(Collection<E> collection){
        System.out.print("Collection is: ");
        for (E obj : collection) {
            System.out.printf("%s ", obj);
        }
        System.out.println();
    }
}
