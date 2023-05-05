package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> school = new ArrayList<>(); // nie wiem dlaczego to nie działa
    private int number;

    public School(List<Integer> school, int number) {
        this.school = school;
        this.number = number;
    }
    public int totalKids(){
        int sum = 0;
        for (int group : school)
            sum += group;
        return sum;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "School{" +
                "school=" + school +
                '}';
    }
}
