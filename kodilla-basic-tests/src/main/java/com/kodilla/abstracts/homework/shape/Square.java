package com.kodilla.abstracts.homework.shape;

public class Square extends Shape{
    public Square(){                            //a gdyby tak nie musieć wpisywać wszystkich 4 parametrów?
        super(10, 10, 10, 10);
    }
    @Override
    public void setArea() {
        double area = getA() * getA();
        System.out.println("This square area: " + area);
    }
    @Override
    public void setPerimeter() {
        double perimeter = 4 * getA();
        System.out.println("This square perimeter: " + perimeter);
    }
}
