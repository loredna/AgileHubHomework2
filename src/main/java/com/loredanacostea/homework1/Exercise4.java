package com.loredanacostea.homework1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/* Write a method that calculates the difference between the largest and the smallest
number in a list of integers. Hint: use Collectors.teeing
*/
public class Exercise4 {

    private Integer calculateDiff(List<Integer> listOfInts) {
        Collections.sort(listOfInts);
        int int1;
        return listOfInts.stream().collect(Collectors.teeing(
                Collectors.maxBy(Comparator.comparingInt(Integer::intValue)),
                Collectors.minBy(Comparator.comparingInt(Integer::intValue)),
                (e1, e2) ->
                        e1.get() - e2.get()
        ));
    }

    public static void main(String[] args) {
        var exercise4 = new Exercise4();
        System.out.println(exercise4.calculateDiff(Arrays.asList(30, 10, 23, 27, 15)));
    }
}
