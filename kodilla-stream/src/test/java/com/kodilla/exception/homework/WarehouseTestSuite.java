package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void isOrderExist_withException() {
        Warehouse warehouse = new Warehouse();
        assertThrows(OrderDoesentExistException.class, () -> warehouse.getOrder("5"));
    }
}