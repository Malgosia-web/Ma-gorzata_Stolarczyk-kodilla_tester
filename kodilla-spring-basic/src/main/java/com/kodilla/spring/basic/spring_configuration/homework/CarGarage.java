package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.time.LocalDate.*;

@Configuration
public class CarGarage {
    @Bean
    public Car changeCarType() {
        Car car;
        if (now().isAfter(of(2023,6,21)) && (now().isBefore(of(2023, 9, 23)))) {
            car = new Cabrio();
        } else if (now().isAfter(of(2023, 12, 23)) && (now().isBefore(of(2024, 3,20)))) {
            car = new SUV();
        } else car = new Sedan();
        return car;
    }
}
