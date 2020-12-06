package com.loredanacostea.homework6.strategy;

public class StrategyToRefactor {

    public void useStrategy(String firstName, String lastName, String strategy) {
        if (strategy.equals("firstNameFirst")) {
            System.out.println(firstName + " " + lastName);
        } else if (strategy.equals("firstNameFirst")) {
            System.out.println(lastName + " " + firstName);
        } else {
            System.out.println("Not a valid strategy");
        }
    }

}
