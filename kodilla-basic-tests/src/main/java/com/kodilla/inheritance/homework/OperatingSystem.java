package com.kodilla.inheritance.homework;

public class OperatingSystem {
    int year;

    public OperatingSystem(int year){
        this.year = year;
    }
    public void turnOn(){
        System.out.println("włącz");
    }
    public void turnOff(){
        System.out.println("wyłącz");
    }
    public int getYear() {
        return year;
    }
    public void displayYear() {
        System.out.println("Rok produkcji: " + year);
    }
}


