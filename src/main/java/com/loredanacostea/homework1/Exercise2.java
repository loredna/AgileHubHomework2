package com.loredanacostea.homework1;

import java.util.Optional;
import java.util.Random;

/*
Write a method that returns an Optional<Integer>, called randomOptionalGenerator.
Randomly, the result should be either value 1 or an empty value. Call it from another
method and, if it contains no result, throw an exception
*/
public class Exercise2 {

    protected Optional<Integer> randomOptionalGenerator() {
        int rand = new Random().nextInt(2);
        return rand == 0 ? Optional.empty() : Optional.of(rand);
    }

    public Integer getRandomValue() {
        return randomOptionalGenerator()
                .orElseThrow();
    }

    public static void main(String[] args) {
        var exercise2 = new Exercise2();

        System.out.println(exercise2.getRandomValue());
    }

}
