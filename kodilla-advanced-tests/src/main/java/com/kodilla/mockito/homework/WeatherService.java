package com.kodilla.mockito.homework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WeatherService {
    private Map<WeatherClient, Area> clients = new HashMap<>();

    //wysyła alert do wszystkich, niezależnie od rejonu
    public void sendGlobalAlert(WeatherAlert alert) {
        for(Map.Entry<WeatherClient, Area> global : clients.entrySet()) {
            global.getKey().receive(alert);
        }
    }
    //wysyła alert do zapisanych na konkretny rejon
    public void sendAreaAlert(WeatherAlert alert, Area area) {
        for(Map.Entry<WeatherClient, Area> local : clients.entrySet()) {
            if (local.getValue() == area) {
                local.getKey().receive(alert);
            }
        }
    }
    //dodaje chętnych
    public void addSubscriber(WeatherClient client, Area area) {
        this.clients.put(client, area);
    }
    //usuwa z wszystkich alertów
    public void removeSubscriberGlobal(WeatherClient client) {
        this.clients.remove(client);
    }
    //usuwa z lokalnych alertów
    public void removeSubscriberFromArea(WeatherClient client, Area area) {
        this.clients.remove(client, area);
    }
    //usuwa rejon
    public void removeArea(Area area) {
        this.clients.values().removeAll(Collections.singleton(area));
    }
}
