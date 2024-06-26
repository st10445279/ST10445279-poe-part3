/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10445279.poe.part3;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author RC_Student_lab
 */
public class TaskManagerTest {
    
    public TaskManagerTest() {
    }

    @Test
    public void testSetDevelopers() {
    }

    @Test
    public void testSetTaskNames() {
    }

    @Test
    public void testSetTaskIDs() {
    }

    @Test
    public void testSetTaskDurations() {
    }

    @Test
    public void testSetTaskStatuses() {
    }

    @Test
    public void testGetDevelopers() {
    }

    @Test
    public void testGetTaskNames() {
    }

    @Test
    public void testGetTaskIDs() {
    }

    @Test
    public void testGetTaskDurations() {
    }

    @Test
    public void testGetTaskStatuses() {
    }

    @Test
    public void testDisplayDoneTasks() {
    }

    @Test
    public void testDisplayLongestTask() {
    }

    @Test
    public void testSearchTaskByName() {
    }

    @Test
    public void testSearchTasksByDeveloper() {
    }

    @Test
    public void testDeleteTaskByName() {
    }

    @Test
    public void testDisplayFullReport() {
    }
    
     // test the unit tests one at a time 
    @Test
    public void testDevelopersArray() {
        TaskManager taskManager = new TaskManager();
        String[] expectedDevelopers = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        Assert.assertArrayEquals(expectedDevelopers, taskManager.getDevelopers());
    }
    
    @Test
    public void testTaskNamesArray() {
        TaskManager taskManager = new TaskManager();
        String[] expected = {"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        Assert.assertArrayEquals(expected, taskManager.getTaskNames());
    }
    
      @Test
    public void testTaskIDsArray() {
        TaskManager taskManager = new TaskManager();
        Integer[] expected = {1, 2, 3, 4};
        Assert.assertArrayEquals(expected, taskManager.getTaskIDs());
    }
    
     @Test
    public void testTaskDurationsArray() {
        TaskManager taskManager = new TaskManager();
        Integer[] expected = {5, 8, 2, 11};
        Assert.assertArrayEquals(expected, taskManager.getTaskDurations());
    }
    
     @Test
    public void testTaskStatusesArray() {
        TaskManager taskManager = new TaskManager();
        String[] expected = {"To Do", "Doing", "Done", "To Do"};
        Assert.assertArrayEquals(expected, taskManager.getTaskStatuses());
    }
    
    @Test
public void testLongestTask() {
    TaskManager taskManager = new TaskManager();
    
    String expectedMessage = "Task with longest duration:\nDeveloper: Glenda Oberholzer, Task Duration: 11";
    String actualLongestTask = getlongestTaskMessage(taskManager);
    assertEquals(expectedMessage, actualLongestTask);
}

private String getlongestTaskMessage(TaskManager taskManager){
String longestTaskMessage = "";
    int maxDurationIndex = 0;
    for (int i = 1; i < taskManager.getTaskDurations().length; i++) {
        if (taskManager.getTaskDurations()[i] > taskManager.getTaskDurations()[maxDurationIndex]) {
            maxDurationIndex = i;
        }
    }
    longestTaskMessage = "Task with longest duration:\nDeveloper: " + taskManager.getDevelopers()[maxDurationIndex] + ", Task Duration: " + taskManager.getTaskDurations()[maxDurationIndex];
    return longestTaskMessage;
}

//second
      @Test
    public void testSearchTaskByNameEquals() {
        TaskManager taskManager = new TaskManager();
        //arrange
        boolean expected = true;
        String expectedTask = "Task found:\nTask Name: Create Login, Developer: Mike Smith, Task Status: To Do";
        //act
        boolean actual = taskManager.searchTaskByName();
        assertEquals(expected, actual);
    }
   
      //third 
     @Test
    public void testSearchTasksByDeveloperEquals() {
        TaskManager taskManager = new TaskManager();
        //arange
        boolean expected = true;
        String expectedTask = "Tasks assigned to Samantha Paulson:\nTask Name: Create Reports, Task Status: Done";
        
        boolean actual = taskManager.searchTasksByDeveloper();
        assertEquals(expected, actual);
    }
 
    
    //fifth
     @Test
    public void testDeleteTaskByNameEquals() {
        TaskManager taskManager = new TaskManager();
        //arrange
        boolean expected = true;
        String expectedMessage = "Task deleted successfully";
        //act
        boolean actual = taskManager.deleteTaskByName();
        assertEquals(expected, actual);
    }
    
}
