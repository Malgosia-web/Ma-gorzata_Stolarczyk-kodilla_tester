package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
public class CarGarageTestSuite {
    @Test
    public void shouldCreateCar() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("changeCarType");
        String carType = car.getCarType();
        System.out.println(carType);
        List<String> possibleCarTypes = Arrays.asList("Cabrio", "SUV", "Sedan");
        Assertions.assertTrue(possibleCarTypes.contains(carType));
    }
    //czy teraz (23:19) światła są zapalone
    @Test
    public void checkLights() {
        CarGarage c = new CarGarage();
        c.changeCarType().hasHeadlightsTurnedOn();
        Assertions.assertTrue(c.changeCarType().hasHeadlightsTurnedOn()); //są
    }
}