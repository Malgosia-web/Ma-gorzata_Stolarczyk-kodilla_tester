package com.kodilla.collections.interfaces.homework;

public class Mazda implements Car{
    private int braking;
    private int speeding;
    private int speed;
    public Mazda(int speeding, int braking) {
        this.speeding = speeding;
        this.braking = braking;
    }
    @Override
    public int getSpeed() {
        System.out.println("Mazda: " + speed);
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
}
