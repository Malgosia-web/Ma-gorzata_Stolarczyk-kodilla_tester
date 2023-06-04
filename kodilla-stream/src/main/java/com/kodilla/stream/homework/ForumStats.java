package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import java.util.List;

public class ForumStats {

    public static double averagePost1(List<User> users) {
        double avg = users
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(avg);
        return avg;
    }
    public static double averagePost2(List<User> users) {
        double avg = users
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(avg);
        return avg;
    }
    public static void main(String[] args) {
        averagePost1(UsersRepository.getUsersList());
        averagePost2(UsersRepository.getUsersList());
    }
}
