package com.kodilla.abstracts.homework.shape;

public class Triangle extends Shape{
    public Triangle(){
        super(3, 10, 5, 7);
    }
    @Override
    public void setArea() {
        double area = getA() * getH() * 0.5;
        System.out.println("This triangle area: " + area);
    }
    @Override
    public void setPerimeter() {
        double perimeter = getA() + getB() + getC();
        System.out.println("This triangle perimeter: " + perimeter);
    }
}
