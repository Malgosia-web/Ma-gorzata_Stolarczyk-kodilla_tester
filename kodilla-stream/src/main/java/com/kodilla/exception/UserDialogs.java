package com.kodilla.exception;

import java.util.Scanner;

public class UserDialogs {
    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // pytanie o liczbę rund
            System.out.println("Enter number of rounds: ");
            String s = scanner.nextLine();
            // ale można wpisać cokolwiek, dlatego jest blok try - żeby przechwycić wyjątek
            // jeżeli w try będzie wyjątek to nie wywali błędu tylko zrobi to co w catch
            try {
                int rounds = Integer.parseInt(s);
                return rounds;
            }   catch (Exception e) {   //wychwyci wszystkie wyjątki z klasy Exception
                System.out.println("Wrong data. Enter only digits. Try again.");
            }
        }
    }
}

