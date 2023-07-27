package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTestSuite {

    @Test
    public void checkTotalKids() {
        School testSchool = new School(Arrays.asList(15, 14, 21, 18), 19);
        int kids = testSchool.totalKids();
        assertEquals(68, kids);
    }

    @Test
    public void checkSchoolNumber() {
        School testSchool = new School(Arrays.asList(15, 14, 21, 18), 19);
        int number = testSchool.getNumber();
        assertEquals(19, number);
    }
}