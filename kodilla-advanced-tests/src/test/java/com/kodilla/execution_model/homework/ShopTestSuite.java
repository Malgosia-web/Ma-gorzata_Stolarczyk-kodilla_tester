package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order o1 = new Order(500, LocalDate.of(2023, 06, 3), "Stefan");
    Order o2 = new Order(200, LocalDate.of(2023, 06, 15), "Stefan");
    Order o3 = new Order(350, LocalDate.of(2023,06,10),"Stefan");

    //Czy dodaje zamówienia do listy
    @Test
    public void shouldAddOrdersToList() {
        assertEquals(3, shop.checkSize());
    }
    //czy filtruje zamówienia z zadanego przedziału dat
    @Test
    public void isDateFilterCorrect() {
        List<Order> order = new ArrayList<>(shop.checkDates(LocalDate.of(2023,06,9),LocalDate.of(2023,06,11)));
        assertTrue(o3.equals(order.get(0)));
    }
    //czy filtruje zamówienia z zadanego zakresu (wartość zamówień)
    @Test
    public void isValueFilterCorrect() {
        List<Order> order = new ArrayList<>(shop.checkValue(300,400));
        assertTrue(o3.equals(order.get(0)));
    }
    //czy dobrze liczy ilość zamówień
    @Test
    public void shouldCountOrders() {
        assertEquals(3, shop.checkSize());
    }
    //czy prawidłowo sumuje wartość wszystkich zamówień
    @Test
    public void shouldCountValue() {
        assertEquals(1050, shop.sumValue());
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(o1);
        shop.addOrder(o2);
        shop.addOrder(o3);
    }
    @BeforeEach
    public void displayText() {
        System.out.println("Test test test");
    }
    @BeforeAll
    public static void displayIntro() {
        System.out.println("Testing time");
    }
    @AfterAll
    public static void displayEnd() {
        System.out.println("THE END");
    }
}