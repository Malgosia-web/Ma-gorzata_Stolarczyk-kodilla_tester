package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> from = new ArrayList<>();

        for (Flight f : FlightRepository.getFlightTable()) {
            if (f.getDeparture().equals(departure)) {
                 from.add(f);
            }
        }
        return from;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> to = new ArrayList<>();

        for (Flight a : FlightRepository.getFlightTable()) {
            if (a.getArrival().equals(arrival)) {
                to.add(a);
            }
        }
        return to;
    }
}
