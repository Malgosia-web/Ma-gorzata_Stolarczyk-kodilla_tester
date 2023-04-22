package com.kodilla.inheritance.homework;
public class App {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2012);
        operatingSystem.displayYear();
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        BetterSystem betterSystem = new BetterSystem();
        betterSystem.displayYear();
        betterSystem.turnOn();
        betterSystem.turnOff();

        OldSystem oldSystem = new OldSystem();
        oldSystem.displayYear();
        oldSystem.turnOn();
    }
}
