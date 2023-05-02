package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car{
    private int braking;
    private int speeding;
    private int speed;
    public Toyota(int speeding, int braking){
        this.speeding = speeding;
        this.braking = braking;
    }
    @Override
    public int getSpeed() {
        System.out.println("Toyota: " + speed);
        return speed;
    }
    @Override
    public void increaseSpeed() {
        speed += speeding;
    }
    @Override
    public void decreaseSpeed() {
        speed -= braking;
    }
    @Override
    public int getSpeeding() {return speeding;}
    @Override
    public int getBraking() {return braking;}
}
