package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "task for task";
    private static final String LISTNAME = "List for task";


//    @Test
//    void testFindByListName(){
//        //Given
//        TaskList taskList = new TaskList( "Oname-Wa", DESCRIPTION);
//        taskListDao.save(taskList);
//        String listName = taskList.getListName();
//
//        //When
//        List<TaskList> readTasksList = taskListDao.findByListName(listName);
//
//        //Then
//        assertEquals(1, readTasksList.size());
//
//        //CleanUp
//        int id = readTasksList.get(0).getId();
//        taskListDao.deleteById(id);
//    }
//
//    @Test
//    void testTaskListDaoSaveWithTasks() {
//        //Given
//        Task task = new Task("Test: Learn Hibernate", 14);
//        Task task2 = new Task("Test: Write some entities", 3);
//        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
//        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
//        task.setTaskFinancialDetails(tfd);
//        task2.setTaskFinancialDetails(tfd2);
//        TaskList taskList = new TaskList( "ToDo tasks",LISTNAME);
//        taskList.getTasks().add(task);
//        taskList.getTasks().add(task2);
//        task.setTaskList(taskList);
//        task2.setTaskList(taskList);
//
//        //When
//        taskListDao.save(taskList);
//        int id = taskList.getId();
//
//        //Then
//        assertNotEquals(0, id);
//
//        //CleanUp
//        //taskListDao.deleteById(id);
//    }
}
