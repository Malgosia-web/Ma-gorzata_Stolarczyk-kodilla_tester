package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse w1 = new Warehouse();
        w1.addOrder(new Order("1"));
        w1.addOrder(new Order("2"));
        w1.addOrder(new Order("3"));

        try {
            w1.getOrder("4");
        } catch (OrderDoesentExistException e) {
            System.out.println("nie ma takiego zamówienia");
        }
    }
}
