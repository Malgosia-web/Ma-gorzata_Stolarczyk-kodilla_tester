package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public List<Student> addStudents() {
        List<Student> s = new ArrayList<>();
        s.add(new Student("Kowalski", new Teacher("Szydełko")));
        s.add(new Student("Kawal", new Teacher("Włółczek")));
        s.add(new Student("Kiwalski", new Teacher("Druciak")));
        s.add(new Student("Kewal", null));
        return s;
    }
    public List<Student> checkTeacher() {
        List<Student> students = addStudents();
        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String undefined = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("uczeń: " + student.getName() + ", nauczyciel: " + undefined);
        }
        return students ;
    }
    public static void main(String[] args) {
        Application a = new Application();
        a.checkTeacher();
    }
}

