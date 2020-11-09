package com.loredanacostea.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
Write a method that takes a List<String> as a parameter. If it’s an ArrayList,
iterate over it using forEach, and print each element. If it’s a LinkedList and
it’s not empty, iterate over it using descendingIterator. Otherwise, print a
disappointing error message. Hint: use instanceof pattern matching
 */
public class Exercise5 {

    private void iterateThroughList(List<String> stringList) {
        if (stringList instanceof ArrayList arrayList) {
            arrayList.forEach(System.out::println);
        } else if (stringList instanceof LinkedList linkedList && !linkedList.isEmpty()) {
            linkedList.descendingIterator()
                    .forEachRemaining(System.out::println);
        } else {
            System.out.println("Unexpected list type.");
        }
    }

    public static void main(String[] args) {
        var exercise5 = new Exercise5();

        List<String> arrayList = new ArrayList<>();
        arrayList.add("List is instance of ArrayList.");
        exercise5.iterateThroughList(arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("List is instance of LinkedList.");
        exercise5.iterateThroughList(linkedList);

        exercise5.iterateThroughList(Arrays.asList("1"));
    }
}
