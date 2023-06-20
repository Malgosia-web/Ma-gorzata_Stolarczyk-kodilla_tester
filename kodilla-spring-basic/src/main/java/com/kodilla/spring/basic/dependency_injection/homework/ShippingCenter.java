package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private DeliveryService deliveryService;
    private NotificationService notificationService;
    public ShippingCenter (DeliveryService deliveryService, NotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.success(address, weight)) {
            notificationService.success(address, weight);
        } else {
            deliveryService.fail(address, weight);
            notificationService.fail(address, weight);
        }
    }
}
