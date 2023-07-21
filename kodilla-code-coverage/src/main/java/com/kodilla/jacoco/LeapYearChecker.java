package com.kodilla.jacoco;

public class LeapYearChecker {
    int year;

    public LeapYearChecker(int year) {
        this.year = year;
    }

    public boolean isLeap() {
        boolean leapYear;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }
        return leapYear;
    }
}
