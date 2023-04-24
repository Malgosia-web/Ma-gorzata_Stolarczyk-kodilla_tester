package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 5;                                                                   //testowe dane
        double b = 8;


        double sumResult = calculator.sum(a , b);                                       //wynik sprawdzanej metody przypisujemy do zmiennej
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);        //wynik ResultCecker przypisujemy do zmiennej
        if (correctSum) {                                                               // jeśli true to...
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {                                                                     // jeśli false to..
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
            }

        double subResult = calculator.subtract(a, b);
        boolean correctSub = ResultChecker.assertEquals(-3, subResult);
        if (correctSub) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double  multiResult = calculator.multi(a);
        boolean correctMulti = ResultChecker.assertEquals(25, multiResult);
        if (correctMulti) {
            System.out.println("Metoda multi działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda multi nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}
