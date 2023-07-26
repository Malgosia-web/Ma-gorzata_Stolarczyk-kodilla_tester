package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    void testFindByListName() {
        //Given
        TaskList tasklist = new TaskList("listNameTest", DESCRIPTION);
        taskListRepository.save(tasklist);
        String listName = tasklist.getListName();

        //When
        List<TaskList> tasks = taskListRepository.findByListName(listName);

        //Then
        Assertions.assertEquals("listNameTest", tasks.get(0).getListName());

        //CleanUp
        int id = tasks.get(0).getId();
        taskListRepository.deleteById(id);
    }
}