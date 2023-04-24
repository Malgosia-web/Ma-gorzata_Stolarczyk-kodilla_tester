package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5.5;
        double b = 8.0;
        double sumResult = calculator.sum(a, b);
        assertEquals(13.5, sumResult, 0.05);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        double a = 5.5;
        double b = 8.0;
        double subResult = calculator.subtract(a, b);
        assertEquals(-2.5, subResult, 0.05);
    }
    @Test
    public void testMulti(){
        Calculator calculator = new Calculator();
        double a = 5.5;
        double multiResult = calculator.multi(a);
        assertEquals(30.25, multiResult, 0.05);
    }
}
