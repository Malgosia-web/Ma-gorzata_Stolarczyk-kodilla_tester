package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GradesTestSuite {
    @Test
    public void checkAverage() {
        Grades testGrades = new Grades(Arrays.asList(5.0, 4.0, 4.5, 5.0, 5.0));
        double average = testGrades.getAverage();
        assertEquals(4.7, average);
    }
}