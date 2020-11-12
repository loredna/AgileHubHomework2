package com.loredanacostea.homework1;

public enum WeekDay {

    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

    public String getDayType() {
        switch (WeekDay.this) {
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