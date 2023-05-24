package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    private String departure;
    private String arrival;

    public List<Flight> findFlightsFrom(String departure) {
        this.departure = departure;
        List<Flight> from = new ArrayList<>();

        for (Flight f : FlightRepository.getFlightTable()) {
            if (f.getDeparture() == this.departure) {
                 from.add(f);
            }
        }
        return from;
    }

    public List<Flight> findFlightsTo(String arrival) {
        this.arrival = arrival;
        List<Flight> to = new ArrayList<>();

        for (Flight a : FlightRepository.getFlightTable()) {
            if (a.getArrival() == this.arrival) {
                to.add(a);
            }
        }
        return to;
    }
}
