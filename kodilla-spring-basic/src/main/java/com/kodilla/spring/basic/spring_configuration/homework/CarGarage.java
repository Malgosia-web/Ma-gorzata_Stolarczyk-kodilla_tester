package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.time.LocalDate.*;

@Configuration
public class CarGarage {
    @Bean
    public Car changeCarType() {
        Car car;
        if (now().getMonthValue() >= 6 && now().getMonthValue() <= 9) {
            car = new Cabrio();
        } else if (now().getMonthValue() >= 11 && now().getMonthValue() <= 3) {
            car = new SUV();
        } else car = new Sedan();
        return car;
    }
}
