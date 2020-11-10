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
        return Map.of(1, "First value", 2, "Second value", 3, "Third value");
    }

    public static void main(String[] args) {
        var exercise1 = new Exercise1();
        Map<Integer, String> mapExample = exercise1.mapExample();
        mapExample.put(4, "Fourth value");
        System.out.println(mapExample);

        /*
        Map.of() - ImmutableCollections
        In order to add an element we can create new HashMap<>(Map.of(...))
         */
    }
}
