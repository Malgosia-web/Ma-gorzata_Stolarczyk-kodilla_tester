package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    private static List<Student> uczniowie = new ArrayList<>();

    public static String checkStudents(Student student) {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String undefined = optionalTeacher.orElse(new Teacher("undefined")).getName();
        System.out.println("uczeń: " + student.getName() + ", nauczyciel: " + undefined);
        return undefined;
    }

    public static void main(String[] args) {

        Student Adam = new Student("Adam", new Teacher("Piotr"));
        Student Gabi = new Student("Gabi", new Teacher("Gosia"));
        Student Sebastian = new Student("Sebastian", null);

        uczniowie.add(Adam);
        uczniowie.add(Gabi);
        uczniowie.add(Sebastian);

        for (Student students : uczniowie) {
            checkStudents(students);
        }
    }
}

