package com.loredanacostea.homework1;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.Random;

/*
Write a method that returns an Optional<Integer>, called randomOptionalGenerator.
Randomly, the result should be either value 1 or an empty value. Call it from another
method and, if it contains no result, throw an exception
*/
public class Exercise2 {

    protected Optional<Integer> randomOptionalGenerator() {
        Integer rand = new Random().nextInt(2);
        if (rand == 0) {
            return Optional.empty();
        }
        return Optional.of(rand);
    }

    public Optional<Integer> validateRandomOptionalGenerator() {
        Optional<Integer> randInt = randomOptionalGenerator();
        if (!randInt.isPresent()) {
            throw new RuntimeException("No value found");
        }
        return randInt;
    }

    public static void main(String[] args) {
        var exercise2 = new Exercise2();

        System.out.println("Method1: ");
        exercise2.validateRandomOptionalGenerator()
                .ifPresent(System.out::println);

        System.out.println("Method2: ");
        exercise2.randomOptionalGenerator().ifPresentOrElse(System.out::println,
                () -> {
                    throw new RuntimeException("No value found");
                });
    }

}
