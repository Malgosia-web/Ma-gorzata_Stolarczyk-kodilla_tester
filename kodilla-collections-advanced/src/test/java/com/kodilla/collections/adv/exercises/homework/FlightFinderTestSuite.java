package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FlightFinderTestSuite {
    FlightFinder flightFinder = new FlightFinder();

    // pusta lista gdy złe miasto przylotu
    @Test
    public void ShouldHaveZeroLengthIfWrongArrival() {
        assertEquals(0, flightFinder.findFlightsTo("Chicago").size());
    }

    // dodaje prawidłowe miasto przylotu
    @Test
    public void ShouldAddArrival() {
        assertEquals(2, flightFinder.findFlightsTo("Ohio").size());
    }

    // pusta lista gdy złe miasto odlotu
    @Test
    public void ShouldHaveZeroLengthIfWrongDeparture() {
        assertEquals(0, flightFinder.findFlightsFrom("Chicago").size());
    }

    // dodaje prawidłowe miasto odlotu
    @Test
    public void ShouldAddDeparture() {
        assertEquals(2, flightFinder.findFlightsFrom("Denver").size());
    }
}