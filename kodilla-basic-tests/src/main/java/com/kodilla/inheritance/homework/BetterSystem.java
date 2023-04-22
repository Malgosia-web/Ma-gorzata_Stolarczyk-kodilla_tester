package com.kodilla.inheritance.homework;
public class BetterSystem extends OperatingSystem {

    public BetterSystem() {
        super(2020);
    }
    @Override
    public void turnOff(){
        System.out.println("nie musisz go wyłączać");
    }

}
