package com.kodilla.abstracts.homework.job;

public class App {
    public static void main(String[] args) {
        Job driver = new Driver();
        Job mechanic = new Mechanic();
        Job salesRepresentative = new SalesRepresentative();

        Person Adam = new Person("Adam", 26, driver);
        Adam.showResponsibilities();

        Person Sebastian = new Person("Sebastian", 21, mechanic);
        Sebastian.showResponsibilities();

    }
}
