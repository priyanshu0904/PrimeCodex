package com.Collections.CollectionsLibrary.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    //stores key-value pairs, each key can map to at most one value
    //keys are unique, multiple keys can map same value
    //part of Collections framework, but does not extend the Collection Interface

    //HashTable, HashMap, TreeMap

    static void main(String[] args) {
        //Map<Key, Value>
        Map<String, Integer> map = new HashMap<>();
        map.put("Priyanshu", 9); //associate the specified value with specified key in map
        map.put("Raj", 7);
        map.put("Priya", 29);
        map.put("Raja", 7);
        //map.put("Raj", 55);
        System.out.println(map.size()); //returns the size of the map
        System.out.println(map.get("Priyanshu")); //returns the value to which the specified key is mapped, if no mapping for key returns null
        System.out.println(map.containsKey("Raj")); //check if the map contains a mapping for the specified key, returns true
        System.out.println(map.containsKey("Rama"));
        System.out.println(map.remove("Raja")); //removes the mapping for a key from the map if it is present, returns the value associated with this
        System.out.println(map.containsKey("Raja"));
        System.out.println(map.size());

        for (String key : map.keySet()) { //returns a set view of the keys contained in the map
            System.out.printf("%s ", key);
        }

        for (Integer mp : map.values()){ //returns a Collection view of the values contained in the map
            System.out.printf("%s ", mp);
        }
    }
}
