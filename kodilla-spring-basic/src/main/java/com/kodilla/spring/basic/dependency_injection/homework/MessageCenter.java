package com.kodilla.spring.basic.dependency_injection.homework;

public interface MessageCenter {
    boolean success(String address, double weight);
    boolean fail(String address, double weight);
}
