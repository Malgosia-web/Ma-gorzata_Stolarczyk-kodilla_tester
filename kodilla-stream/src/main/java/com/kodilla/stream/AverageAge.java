package com.kodilla.stream;

public class AverageAge {

    public static void main(String[] args) {

        // przypisanie wyniku do zmiennej
        double avg = UsersRepository.getUsersList()

                .stream()

                //metoda mapToInt liczby typu Integer na wejściu przetwarza na liczby typu int na wyjściu (n->n to wyrażenie lambda)
                .mapToInt(n -> n.getAge())

                //wywołujemy kolektor average
                .average()

                //konwerujemy zwrócony przez average typ OptionalDouble do zwykłaego typu double
                .getAsDouble();

        System.out.println(avg);
    }
}
