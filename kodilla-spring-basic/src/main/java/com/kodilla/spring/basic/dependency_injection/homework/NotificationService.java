package com.kodilla.spring.basic.dependency_injection.homework;

public class NotificationService implements MessageCenter{
    @Override
    public boolean success(String address, double weight) {
        System.out.println("Package delivered to: " + address);
        return true;
    }
    @Override
    public boolean fail(String address, double weight) {
        System.out.println("Package not delivered to: " + address);
        return false;
    }
}
