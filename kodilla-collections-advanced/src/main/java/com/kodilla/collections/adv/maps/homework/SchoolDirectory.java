package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> zmienna = new HashMap<>();
        Principal john = new Principal("John", "Jooon");
        Principal adam = new Principal("Adam", "Adaaaa");
        Principal piotr = new Principal("Piotr", "Pi");

        School johnSchool = new School(Arrays.asList(15, 14, 21, 18), 19);
        School adamSchool = new School(Arrays.asList(10, 7, 12, 13, 9, 11, 9), 44);
        School piotrSchool = new School(Arrays.asList(31, 27, 32, 30), 28);

        zmienna.put(john, johnSchool);
        zmienna.put(adam, adamSchool);
        zmienna.put(piotr, piotrSchool);

        for (Map.Entry<Principal, School> principalEntry : zmienna.entrySet()) {
            System.out.println("Dyrektor " + principalEntry.getKey().getFirstname() + " " + principalEntry.getKey().getLastname());
            System.out.println("Szkoła nr " + principalEntry.getValue().getNumber());
            System.out.println("Ilość uczniów: " + principalEntry.getValue().totalKids());
            System.out.println("---------------------------------------");
        }
    }
}



