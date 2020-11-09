package com.loredanacostea.homework1;

/*
Define an enum with the days of the week.
Add to it a function which returns a string describing whether it’s a workday or a weekend day.
 */
public class Exercise7 {

    public String getDayType(WeekDay weekDay) {
        switch (weekDay) {
            case Monday, Tuesday, Wednesday, Thursday, Friday -> {
                return "Workday";
            }
            case Saturday, Sunday -> {
                return "Weekend Day";
            }
            default -> {
                return "Invalid week day!";
            }
        }

    }

    public static void main(String[] args) {
        Exercise7 exercise7 = new Exercise7();
        System.out.println(exercise7.getDayType(WeekDay.Monday));
        System.out.println(exercise7.getDayType(WeekDay.Saturday));
    }
}
