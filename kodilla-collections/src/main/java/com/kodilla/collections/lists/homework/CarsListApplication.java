package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(10,5));
        Car toyota = new Toyota(7, 7);
        cars.add(toyota);
        cars.add(new Mazda(8,4));

        System.out.println("Size: " + cars.size());
        for (Car car : cars)
            CarUtils.describeCar(car);
        System.out.println("-----------------------------");

        cars.remove(0);
        cars.remove(toyota);

        System.out.println("-----------------------------");
        System.out.println("Size: " + cars.size());
        for (Car car : cars)
            CarUtils.describeCar(car);
    }
}
