package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


class WeatherServiceTestSuite {
    WeatherService weatherService = new WeatherService();
    WeatherClient client1 = Mockito.mock(WeatherClient.class);
    WeatherClient client2 = Mockito.mock(WeatherClient.class);
    WeatherClient client3 = Mockito.mock(WeatherClient.class);
    WeatherClient client4 = Mockito.mock(WeatherClient.class);

    WeatherAlert globalAlert = Mockito.mock(WeatherAlert.class);
    WeatherAlert areaAlert = Mockito.mock(WeatherAlert.class);

    @BeforeEach
    public void add() {
        weatherService.addSubscriber(client1, 1);
        weatherService.addSubscriber(client1, 2);
        weatherService.addSubscriber(client2, 2);
        weatherService.addSubscriber(client3, 1);
        weatherService.addSubscriber(client3, 2);
        weatherService.addSubscriber(client3, 3);
    }

    //client4 nie jest nigdzie zapisany, nie powinien nic dostać
    @Test
    public void notSubscribedClientShouldNotReceiveAlert() {
        weatherService.sendGlobalAlert(globalAlert);
        Mockito.verify(client4, Mockito.never()).receive(globalAlert);
    }

    //każdy zapisany dostaje alert globalny
    @Test
    public void subscribedClientShouldReceiveAlert() {
        weatherService.sendGlobalAlert(globalAlert);
        Mockito.verify(client1).receive(globalAlert);
        Mockito.verify(client2).receive(globalAlert);
        Mockito.verify(client3).receive(globalAlert);
    }

    //client1 i client3 dostają lokalny alert area1, client2 nie
    @Test
    public void subscribedClientShouldReceiveAreaAlert() {
        weatherService.sendAreaAlert(areaAlert, 1);
        Mockito.verify(client1).receive(areaAlert);
        Mockito.verify(client3).receive(areaAlert);
        Mockito.verify(client2, Mockito.never()).receive(areaAlert);
    }

    //client1 wypisuje się z area1, client3 zostaje
    @Test
    public void unsubscribedClientShouldNotReceiveAreaAlert() {
        weatherService.removeSubscriberFromArea(client1, 1);
        weatherService.sendAreaAlert(areaAlert, 1);
        Mockito.verify(client1, Mockito.never()).receive(areaAlert);
        Mockito.verify(client3).receive(areaAlert);
    }

    //client1 wypisuje się globalnie
    @Test
    public void unsubscribedClientShouldNotReceiveAlert() {
        weatherService.removeSubscriberGlobal(client1);
        weatherService.sendGlobalAlert(globalAlert);
        weatherService.sendAreaAlert(areaAlert, 1);
        weatherService.sendAreaAlert(areaAlert, 2);
        Mockito.verify(client1, Mockito.never()).receive(globalAlert);
        Mockito.verify(client1, Mockito.never()).receive(areaAlert);
    }

    //client1 i client3 nie dostają alertów z usuniętego area1
    @Test
    public void deleteArea() {
        weatherService.removeArea(1);
        weatherService.sendAreaAlert(areaAlert, 1);
        Mockito.verify(client1, Mockito.never()).receive(areaAlert);
        Mockito.verify(client3, Mockito.never()).receive(areaAlert);
    }
}