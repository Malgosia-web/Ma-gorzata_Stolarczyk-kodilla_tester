package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ClockTestSuite {
    @Test
    public void shouldCreateDifferentTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock c1 = context.getBean(Clock.class);
        Clock c2 = context.getBean(Clock.class);
        Clock c3 = context.getBean(Clock.class);
        Assertions.assertNotEquals(c1, c2);
        Assertions.assertNotEquals(c2 , c3);
    }

}