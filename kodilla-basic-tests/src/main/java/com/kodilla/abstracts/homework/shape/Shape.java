package com.kodilla.abstracts.homework.shape;

public abstract class Shape {
    private double a;
    private double b;
    private double h;
    private double c;

    public Shape (double a, double b, double c, double h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }public double getA() {
       return a;
    }
    public double getB() {
        return b;
    }
    public double getC(){
        return c;
    }
    public double getH(){
        return h;
    }
    public abstract void setArea();
    public abstract void setPerimeter();
}
