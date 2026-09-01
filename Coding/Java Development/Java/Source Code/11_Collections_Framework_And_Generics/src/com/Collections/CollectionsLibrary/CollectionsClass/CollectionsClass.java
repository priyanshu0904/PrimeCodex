package com.Collections.CollectionsLibrary.CollectionsClass;

import com.Collections.CollectionsLibrary.CollectionInterface.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
    static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(88);
        nums.add(-77);
        nums.add(5);
        Utility.print(nums);

        Collections.sort(nums);
        System.out.println("After sorting: ");
        Utility.print(nums);

        Collections.reverse(nums);
        Utility.print(nums);

        Collections.shuffle(nums);
        Utility.print(nums);
        System.out.println(Collections.min(nums));

        List<Integer> unmodified = Collections.unmodifiableList(nums);
        unmodified.add(55); //throws exception
    }
}
