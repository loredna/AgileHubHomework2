package com.loredanacostea.homework1;

public enum WeekDay {

    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

    public static String getDayType(WeekDay weekDay) {
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
}