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

    Area a1 = Mockito.mock(Area.class);
    Area a2 = Mockito.mock(Area.class);

    WeatherAlert globalAlert = Mockito.mock(WeatherAlert.class);
    WeatherAlert areaAlert = Mockito.mock(WeatherAlert.class);

    @BeforeEach
    public void add() {
        weatherService.addSubscriber(client1, a1);
        weatherService.addSubscriber(client2, a1);
        weatherService.addSubscriber(client3, a2);
    }

    //client4 nie jest nigdzie zapisany, nie powinien nic dostać
    @Test //OK
    public void notSubscribedClientShouldNotReceiveAlert() {
        weatherService.sendGlobalAlert(globalAlert);
        Mockito.verify(client4, Mockito.never()).receive(globalAlert);
    }
    //client1 wypisuje się z a1
    @Test
    public void unsubscribedClientShouldNotReceiveAreaAlert() {
        weatherService.removeSubscriberFromArea(client1, a1);
        weatherService.sendAreaAlert(areaAlert, a1);
        Mockito.verify(client1, Mockito.never()).receive(areaAlert);
        Mockito.verify(client2).receive(areaAlert);
    }
    //client1 wypisuje się globalnie
    @Test //OK
    public void unsubscribedClientShouldNotReceiveAlert() {
        weatherService.removeSubscriberGlobal(client1);
        weatherService.sendGlobalAlert(globalAlert);
        Mockito.verify(client1, Mockito.never()).receive(globalAlert);
        Mockito.verify(client2).receive(globalAlert);
    }
    //każdy zapisany dostaje alert globalny
    @Test //OK
    public void subscribedClientShouldReceiveAlert() {
        weatherService.sendGlobalAlert(globalAlert);
        Mockito.verify(client1).receive(globalAlert);
        Mockito.verify(client2).receive(globalAlert);
        Mockito.verify(client3).receive(globalAlert);
    }
    //client1 i client2 dostają lokalny alert a1
    @Test //OK
    public void subscribedClientShouldReceiveAreaAlert() {
        weatherService.sendAreaAlert(areaAlert, a1);
        Mockito.verify(client1).receive(areaAlert);
        Mockito.verify(client2).receive(areaAlert);
        Mockito.verify(client3, Mockito.never()).receive(areaAlert);
    }
    //client1 i client2 nie dostają alertów z usuniętego a1
    @Test
    public void deleteArea() {
        weatherService.removeArea(a1);
        weatherService.sendAreaAlert(areaAlert, a1);
        Mockito.verify(client1, Mockito.never()).receive(areaAlert);
        Mockito.verify(client2, Mockito.never()).receive(areaAlert);
    }
}