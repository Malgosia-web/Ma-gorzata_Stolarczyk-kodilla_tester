package com.kodilla.abstracts.homework.job;

public class App {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Mechanic mechanic = new Mechanic();
        SalesRepresentative salesRepresentative = new SalesRepresentative();

        Person Adam = new Person("Adam", 26, driver);
        Adam.showResponsibilities();

        Person Sebastian = new Person("Sebastian", 21, mechanic);
        Sebastian.showResponsibilities();

    }
}
