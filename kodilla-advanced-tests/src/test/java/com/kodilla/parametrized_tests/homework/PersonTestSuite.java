package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DoubleSources#provideDoubleForTestingBMI")
    public void blebleble(double height, double weight, String expected){
        Person person = new Person(height, weight);
        assertEquals(expected, person.getBMI());
    }
}