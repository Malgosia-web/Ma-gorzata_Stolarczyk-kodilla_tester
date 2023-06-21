package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherService {
    private Map<String, Set<WeatherClient>> subscribers = new HashMap<>();

    //dodaje chętnych
    public void addSubscriber(WeatherClient client, String area) {
        if (this.subscribers.containsKey(area)) {
            this.subscribers.get(area).add(client);
        }
        else {
            Set<WeatherClient> clients = new HashSet<>();
            clients.add(client);
            this.subscribers.put(area, clients);
        }
    }
    //wysyła alert do wszystkich, niezależnie od rejonu
    public void sendGlobalAlert(WeatherAlert alert) {
        Set<WeatherClient> clients = new HashSet<>();
        for (Map.Entry<String, Set<WeatherClient>> global : subscribers.entrySet()) {
            global.getValue();
            for (WeatherClient c : global.getValue()) {
                clients.add(c);
            }
        }
        for (WeatherClient c : clients) {
            c.receive(alert);
        }
    }
    //wysyła alert do zapisanych na konkretny rejon
    public void sendAreaAlert(WeatherAlert alert, String area) {
        this.subscribers.get(area).forEach(client -> client.receive(alert));
    }
    //usuwa z wszystkich alertów
    public void removeSubscriberGlobal(WeatherClient client) {
        this.subscribers.values().forEach(weatherClients -> weatherClients.remove(client));
    }
    //usuwa z lokalnych alertów
    public void removeSubscriberFromArea(WeatherClient client, String area) {
        this.subscribers.get(area).remove(client);
    }
    //usuwa rejon
    public void removeArea(String area) {
        this.subscribers.get(area).clear();
    }
}

