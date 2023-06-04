package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTestSuite {


    //czy liczy dobrze 40 i 40+
    @Test
    public void correctAverage40() {
        List<User> use = new ArrayList<>();
        User adam = new User("Adam", 30, 10, "Manager");
        User gabi = new User("Gabi", 39, 20, "Manager");
        User sebastian = new User("Sebastian", 40, 30, "Manager");
        User piotr = new User("Piotr", 41, 40, "Manager");
        User gosia = new User("Gosia", 45, 50, "Manager");
        use.add(adam);
        use.add(gabi);
        use.add(sebastian);
        use.add(piotr);
        use.add(gosia);

        assertEquals(40, ForumStats.averagePost1(use));
    }

    //czy liczy dobrze poniżej 40
    @Test
    public void correctAverageBelow40() {
        List<User> use = new ArrayList<>();
        User adam = new User("Adam", 30, 10, "Manager");
        User gabi = new User("Gabi", 39, 20, "Manager");
        User sebastian = new User("Sebastian", 40, 30, "Manager");
        User piotr = new User("Piotr", 41, 40, "Manager");
        User gosia = new User("Gosia", 45, 50, "Manager");
        use.add(adam);
        use.add(gabi);
        use.add(sebastian);
        use.add(piotr);
        use.add(gosia);

        assertEquals(15, ForumStats.averagePost2(use));
    }
}