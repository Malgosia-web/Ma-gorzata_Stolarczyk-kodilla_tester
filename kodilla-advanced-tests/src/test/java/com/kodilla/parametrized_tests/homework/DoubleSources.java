package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DoubleSources {
    static Stream<Arguments> provideDoubleForTestingBMI() {
        return Stream.of(
                Arguments.of(1.60, 49, "Normal (healthy weight)"),
                Arguments.of(1.55, 69, "Overweight"),
                Arguments.of(1.70, 49, "Underweight"),
                Arguments.of(1.8, 49, "Severely underweight"),
                Arguments.of(1.75, 105, "Obese Class I (Moderately obese)")
        );
    }
}
