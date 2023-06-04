package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTestSuite {


    @Test
    public void checkStudentsTest() {
        Student adam = new Student("Adam" , null);

        //Czy null
        assertNull(adam.getTeacher());

        //czy zmienia na obiekt
        assertNotNull(Application.checkStudents(adam));

        //czy wyświetla prawidłowy napis
        assertEquals("undefined", Application.checkStudents(adam));
    }
}