package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.time.LocalDate.*;

@Configuration
public class CarGarage {
    @Bean
    public Car changeCarType() {
        Car car;
        if (now().isAfter(of(now().getYear(), 6,21)) && (now().isBefore(of(now().getYear(), 9, 23)))) {
            car = new Cabrio();
        } else if (now().isAfter(of(now().getYear(), 12, 23)) && (now().isBefore(of(now().getYear(), 3,20)))) {
            car = new SUV();
        } else car = new Sedan();
        return car;
    }
}
