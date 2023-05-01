package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];

        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }
    private static Car drawCar() {
        int drawCarName = RANDOM.nextInt(3);
        int speeding = getRandomSpeeding();
        if (drawCarName == 0)
            return new Mazda(speeding, 6);
        else if (drawCarName == 1)
            return new Toyota(speeding, 7);
        else
            return new Ford(speeding, 5);
    }
    private static int getRandomSpeeding() {
        return RANDOM.nextInt(50) + 1;
    }
}
