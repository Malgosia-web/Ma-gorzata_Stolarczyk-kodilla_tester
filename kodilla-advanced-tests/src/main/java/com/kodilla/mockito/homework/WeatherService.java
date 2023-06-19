package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherService {
    private Set<WeatherClient> area1 = new HashSet<>();
    private Set<WeatherClient> area2 = new HashSet<>();
    private Set<WeatherClient> area3 = new HashSet<>();
    Set<WeatherClient> global = new HashSet<>();

    //dodaje chętnych
    public void addSubscriber(WeatherClient client, int area) {
        if (area == 1)  {this.area1.add(client); this.global.add(client);}
        else if (area == 2) {this.area2.add(client); this.global.add(client);}
        else if (area == 3) {this.area3.add(client); this.global.add(client);}
        else System.out.println("nie ma takiego obszaru");
    }

    //wysyła alert do wszystkich, niezależnie od rejonu
    public void sendGlobalAlert(WeatherAlert alert) {
        this.global.forEach(client -> client.receive(alert));
    }

    //wysyła alert do zapisanych na konkretny rejon
    public void sendAreaAlert(WeatherAlert alert, int area) {
        if (area == 1) this.area1.forEach(client -> client.receive(alert));
        else if (area == 2) this.area2.forEach(client -> client.receive(alert));
        else if (area == 3) this.area3.forEach(client -> client.receive(alert));
        else System.out.println("nie ma takiego obszaru");
    }

    //usuwa z wszystkich alertów
    public void removeSubscriberGlobal(WeatherClient client) {
        this.area1.remove(client);
        this.area2.remove(client);
        this.area3.remove(client);
        this.global.remove(client);
    }
    //usuwa z lokalnych alertów
    public void removeSubscriberFromArea(WeatherClient client, int area) {
        if (area == 1) this.area1.remove(client);
        else if (area == 2) this.area2.remove(client);
        else if (area == 3) this.area3.remove(client);
        else System.out.println("nie ma takiego obszaru");
    }
    //usuwa rejon
    public void removeArea(int area) {
        if (area == 1) this.area1.clear();
        else if (area == 2) this.area2.clear();
        else if (area == 3) this.area3.clear();
        else System.out.println("nie ma takiego obszaru");
    }
}
