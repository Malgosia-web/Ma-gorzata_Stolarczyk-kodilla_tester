package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTestSuite {
    @Test
    public void shouldReturnFalseForHeavyPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        Assertions.assertTrue(bean.deliverPackage("adres", 30));
        Assertions.assertFalse(bean.deliverPackage("adres", 31));
    }
    @Test
    public void shouldDeliverIfWeightOk() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("adres", 30);
        Assertions.assertEquals("Package delivered to: adres", message);
    }
    @Test
    public void shouldNotDeliverIfToHeavy() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("adres", 31);
        Assertions.assertEquals("Package not delivered to: adres", message);
    }
}