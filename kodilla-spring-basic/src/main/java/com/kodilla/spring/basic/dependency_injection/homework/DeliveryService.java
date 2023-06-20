package com.kodilla.spring.basic.dependency_injection.homework;

public class DeliveryService implements MessageCenter {

    @Override
    public boolean fail(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        return true;
    }
    @Override
    public boolean success(String address, double weight) {
        if (weight <= 30) {
            System.out.println("Delivering in progress...");
            return true;
        }
        return false;
    }
}
