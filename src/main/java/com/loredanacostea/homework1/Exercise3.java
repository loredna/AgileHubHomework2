package com.loredanacostea.homework1;

import java.util.Optional;

/*
Write a method that calls randomOptionalGenerator. If it returns a value, print it.
Otherwise, print the message: “You’ve reached the end of INT”
*/
public class Exercise3 {

    public static void main(String[] args) {
        var exercise2 = new Exercise2();
        exercise2.randomOptionalGenerator()
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("You’ve reached the end of INT"));
    }
}
