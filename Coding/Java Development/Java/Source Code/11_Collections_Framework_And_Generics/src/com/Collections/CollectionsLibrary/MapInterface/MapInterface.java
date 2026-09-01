package com.Collections.CollectionsLibrary.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Priyanshu", 9);
        map.put("Raj", 7);
        map.put("Priya", 29);
        map.put("Raja", 7);
        //map.put("Raj", 55);
        System.out.println(map.size());
        System.out.println(map.get("Priyanshu"));
        System.out.println(map.containsKey("Raj"));
        System.out.println(map.containsKey("Rama"));
        System.out.println(map.remove("Raja"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n", key, map.get(key));
        }
    }
}
