package com.kodilla.patterns.factory.tasks;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {
    @Test
    void factoryTaskMaker(){

        //Given
        TaskFactory factory1 = new TaskFactory();
        TaskFactory factory2 = new TaskFactory();
        TaskFactory factory3 = new TaskFactory();
        //When
        Task task1 = factory1.makeTask(TaskFactory.SHOPPING, true);
        Task task2 = factory2.makeTask(TaskFactory.PAINTING,false);
        Task task3 = factory3.makeTask(TaskFactory.DRIVING,true);

        //Then
        assertEquals("execute", task1.executeTask());
        assertEquals("execute", task2.executeTask());
        assertEquals("execute", task3.executeTask());

        assertEquals(true, task1.isTaskExecuted());
        assertEquals(false, task2.isTaskExecuted());
        assertEquals(true, task3.isTaskExecuted());

        assertEquals("Shopping Task", task1.getTaskName());
        assertEquals("Painting Task", task2.getTaskName());
        assertEquals("Driving Task", task3.getTaskName());

    }

}

