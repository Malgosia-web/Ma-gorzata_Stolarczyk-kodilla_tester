package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class GamblingMachine {

    //wpierw sprawdza czy zbiór liczb uzytkownika jest prawidłowy
    //generuje zbiór liczb komputera
    //jeśli numer użytkownika jest w zbiorze komputera, mamy punkt
    public int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException {
        validateNumbers(userNumbers);
        Set<Integer> computerNumbers = generateComputerNumbers();
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }
    //błąd jeśli zły rozmiar lub zły przedział
    private void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (isNotCorrectSize(numbers) || isAnyNumberOutOfDeclaredScope(numbers)) {
            throw new InvalidNumbersException();
        }
    }
    //przedział liczb: 1-49
    private boolean isAnyNumberOutOfDeclaredScope(Set<Integer> numbers) {
        return numbers.stream()
                .anyMatch(number -> number < 1 || number > 49);
    }
    //ilość liczb w zbiorze 6
    private boolean isNotCorrectSize(Set<Integer> numbers) {
        return numbers.size() != 6;
    }
    //generuje losowe liczby z zakresu od 1 do 49
    private Set<Integer> generateComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while(numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;
    }
}
