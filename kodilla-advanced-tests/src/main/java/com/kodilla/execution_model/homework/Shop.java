package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(new Order(order.getValue(),order.getDate(),order.getLogin()));
    }

    public List<Order> checkDates(LocalDate dateMin, LocalDate dateMax) {
        List<Order> orderDate = orders.stream()
                .filter(order -> order.getDate().isBefore(dateMax))
                .filter(order -> order.getDate().isAfter(dateMin))
                .collect(Collectors.toList());
        return orderDate;
    }
    public List<Order> checkValue(int valueMin, int valueMax) {
        List<Order> orders1 = orders.stream()
                .filter(order -> order.getValue() >= valueMin)
                .filter(order -> order.getValue() <= valueMax)
                .collect(Collectors.toList());
        return orders1;
    }
    public int checkSize() {
        int size = orders.size();
        return size;
    }
    public int sumValue() {
        int sum = 0;
        for (Order value: orders) {
            sum += value.getValue();
        }
        return sum;
    }
}
