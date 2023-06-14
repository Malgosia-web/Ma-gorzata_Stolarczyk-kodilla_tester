package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    private GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachine.csv", numLinesToSkip = 1, delimiter = '+')
    public void validateNumbersWithException(String input) {
        String[] number = input.split(",");
        Set<Integer> numbers = new HashSet<>();
        for (String n: number) {
            numbers.add(Integer.parseInt(n));
        }
        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(numbers));
    }
    @ParameterizedTest
    @CsvSource(value = "1,2,3,4,5,6", delimiter = '+')
    public void isCountCorrect(String input) throws InvalidNumbersException {
        String[] number = input.split(",");
        Set<Integer> numbers = new HashSet<>();
        for (String n: number) {
            numbers.add(Integer.parseInt(n));
        }
        boolean a = (machine.howManyWins(numbers) >= 0 && machine.howManyWins(numbers) <=6);
        assertTrue(a);
    }
}