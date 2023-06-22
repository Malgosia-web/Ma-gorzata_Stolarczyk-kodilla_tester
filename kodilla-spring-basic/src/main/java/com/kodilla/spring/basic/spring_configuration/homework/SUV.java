package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car {
    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime t1 = LocalTime.of(05,59,59);
        LocalTime t2 = LocalTime.of(20,00);
        if (LocalTime.now().isAfter(t1) && LocalTime.now().isBefore(t2)) {
            return false;
        }
        else return true;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
