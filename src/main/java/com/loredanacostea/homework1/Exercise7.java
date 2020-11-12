package com.loredanacostea.homework1;

/*
Define an enum with the days of the week.
Add to it a function which returns a string describing whether it’s a workday or a weekend day.
 */
public class Exercise7 {

    public static void main(String[] args) {
        System.out.println(WeekDay.Monday.getDayType());
        System.out.println(WeekDay.Saturday.getDayType());
    }
}
