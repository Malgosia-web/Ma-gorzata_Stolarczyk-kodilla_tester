package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CalculatorTestSuite {
    @Test
    public void shouldReturnCorrectAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double add = bean.add(2.0,2.0);
        Assertions.assertEquals(4.0, add);
    }
    @Test
    public void shouldReturnCorrectSubtract() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double sub = bean.subtract(3.0,2.0);
        Assertions.assertEquals(1.0, sub);
    }
    @Test
    public void shouldReturnCorrectMultiply() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double multi = bean.multiply(2.0,2.0);
        Assertions.assertEquals(4.0, multi);
    }
    @Test
    public void shouldReturnCorrectDivide() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double div = bean.divide(4.0,2.0);
        Assertions.assertEquals(2.0, div);
    }
}