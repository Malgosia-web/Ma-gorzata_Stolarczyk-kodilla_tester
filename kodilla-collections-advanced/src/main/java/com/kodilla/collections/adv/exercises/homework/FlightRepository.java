package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Ohio", "Denver"));
        flights.add(new Flight("LA", "Oklahoma"));
        flights.add(new Flight("Denver", "LA"));
        flights.add(new Flight("Oklahoma", "Ohio"));
        flights.add(new Flight("LA", "Ohio"));
        flights.add(new Flight("Denver", "Oklahoma"));
        return flights;
    }
}
