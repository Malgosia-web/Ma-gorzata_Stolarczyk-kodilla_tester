package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car mazda = new Mazda(10, 6);
        doRace(mazda);

        Car toyota = new Toyota(8, 7);
        doRace(toyota);

        Car ford = new Ford(11, 5);
        doRace(ford);
    }
    private static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        car.getSpeed();
    }
}
