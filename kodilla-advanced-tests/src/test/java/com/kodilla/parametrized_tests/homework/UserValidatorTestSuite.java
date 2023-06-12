package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    UserValidator validator = new UserValidator();

    //nieprawidłowe znaki, za mało znaków
    @ParameterizedTest
    @ValueSource(strings = {"ł", "Ł", "11", "-1", "*", "?", "a", " ", ""})
    public void shouldReturnFalseIfUsernameIsNotValid(String username) {
        boolean result = validator.validateUsername(username);
        assertFalse(result);
    }

    //prawidłowe znaki
    @ParameterizedTest
    @ValueSource(strings = {"a.0L", "aaa", "aaaaaa"})
    public void shouldReturnTrueIfUsernameIsCorrect(String username) {
        boolean result = validator.validateUsername(username);
        assertTrue(result);
    }
    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsNull(String email) {
        boolean result = validator.validateEmail(email);
        assertFalse(result);
    }
    //prawidłowe znaki
    @ParameterizedTest
    @ValueSource(strings = {"aaa.aa@aa.aa.aaaa", "aa@aa.aa.aaaa", "aa@aa.aa"})
    public void shouldReturnTrueIfEmailIsCorrect(String email) {
        boolean result = validator.validateEmail(email);
        assertTrue(result);
    }
    //nieprawidłowe znaki
    @ParameterizedTest
    @ValueSource(strings = {"łał.aa@aa.aa.aaaa", "aaa.?@aa.aa.aaaa", "aaa.aa.aa.aaaa", "aa@aa", "aa@aa.aaaaaaa", "aa@aa.aa.aaaaaaa"})
    public void shouldReturnFalseIfEmailIsNotValid(String email) {
        boolean result = validator.validateEmail(email);
        assertFalse(result);
    }



}