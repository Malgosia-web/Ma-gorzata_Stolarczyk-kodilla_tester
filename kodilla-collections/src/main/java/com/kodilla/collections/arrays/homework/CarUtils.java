package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Ford;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("-----------------------------");
        System.out.println("Car name: " + getCarName(car));
        System.out.println("Car speeding: " + car.getSpeeding());
    }
    private static String getCarName(Car car) {
        if (car instanceof Mazda)
            return "Mazda";
        else if (car instanceof Toyota)
            return "Toyota";
        else if (car instanceof Ford)
            return "Ford";
        else
            return "Unknown car name";
    }
}
