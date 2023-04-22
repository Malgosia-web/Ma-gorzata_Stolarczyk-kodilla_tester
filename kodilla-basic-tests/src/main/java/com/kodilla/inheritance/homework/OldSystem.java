package com.kodilla.inheritance.homework;

public class OldSystem extends OperatingSystem {
        public OldSystem() {
            super(2000);
        }
        @Override
        public void turnOn(){
            System.out.println("może lepiej go nie włączaj");
        }

    }
