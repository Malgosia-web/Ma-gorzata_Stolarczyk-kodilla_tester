package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        try {
            boolean isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status is: " + isViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry, this airport cannot be served by our airlines");;
        } finally { //wykona się zawsze
            System.out.println("Ehh");
        }
    }
}
