package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Warehouse {
    public List<Order> orders = new ArrayList<>();
    public void addOrder(Order order) {
        orders.add(new Order(order.getNumber()));
    }
    public Order getOrder(String number) throws OrderDoesentExistException {
            Optional<Order> order = orders
                    .stream()
                    .filter(o -> o.getNumber().equals(number))
                    .findAny();
            return order.orElseThrow(OrderDoesentExistException::new);
    }
}
