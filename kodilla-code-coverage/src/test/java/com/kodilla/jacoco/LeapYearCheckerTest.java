package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearCheckerTest {
    @Test
    void shouldBeLeapYearIfDivisibleBy4And100And400() {

        //given
        LeapYearChecker leapYearChecker = new LeapYearChecker(1600);

        //when
        boolean isLeapYear = leapYearChecker.isLeap();

        //then
        assertTrue(isLeapYear);
    }
    @Test
    void shouldNotBeLeapYearIfItsNotDivisibleBy4By100By400() {

        //given
        LeapYearChecker leapYearChecker = new LeapYearChecker(2023);

        //when
        boolean isLeapYear = leapYearChecker.isLeap();

        //then
        assertFalse(isLeapYear);
    }
}