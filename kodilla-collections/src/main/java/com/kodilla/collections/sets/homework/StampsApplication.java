package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("krajowy z kwiatkiem", 3, "nie"));
        stamps.add(new Stamp("krajowy z papieżem", 4,"nie"));
        stamps.add(new Stamp("zagraniczny z pandą", 3,"tak"));
        stamps.add(new Stamp("krajowy z kwiatkiem", 3,"nie"));
        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
