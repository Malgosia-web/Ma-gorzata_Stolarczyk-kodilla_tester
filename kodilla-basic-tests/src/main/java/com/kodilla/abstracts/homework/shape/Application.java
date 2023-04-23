package com.kodilla.abstracts.homework.shape;

public class Application {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setArea();
        triangle.setPerimeter();

        Square square = new Square();
        square.setArea();
        square.setPerimeter();
    }
}
