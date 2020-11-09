package com.loredanacostea.homework1;

import java.util.HashMap;
import java.util.Map;

/*
Write a method that returns a Map<Integer, String> called mapExample. Fill it with 3
separate key - value pairs. Call it from another method and add something to the results.
Add a comment in your code to explain the whole behavior (why it works / fails)
*/
public class Exercise1 {
    public Map<Integer, String> mapExample() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "First value");
        myMap.put(2, "Second value");
        myMap.put(3, "Third value");
        return myMap;
    }

    public static void main(String[] args) {
        var exercise1 = new Exercise1();
        Map<Integer, String> mapExample = exercise1.mapExample();
        mapExample.put(4, "Fourth value");
        System.out.println(mapExample);

        /*
        The fourth element would not be added because mapExample is returning a Map,
         which is an interface and can't be changed, but can be used.
         If we want to add new element in the map we can use HaspMap as a returning type instead,
          which is the impl of Map.
        */
    }
}
