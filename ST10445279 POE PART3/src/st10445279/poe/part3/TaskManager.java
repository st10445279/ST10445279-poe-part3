/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10445279.poe.part3;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class TaskManager {
    private String[] developers;
    private String[] taskNames;
    //Use Interger instead of int because of the Generic removeElement is of Type T which is except type of Object and int is primiritve type not Object
    private Integer[] taskIDs;
    private Integer[] taskDurations;
    private String[] taskStatuses;
    
    //setter

    public void setDevelopers(String[] developers) {
        this.developers = developers;
    }

    public void setTaskNames(String[] taskNames) {
        this.taskNames = taskNames;
    }

    public void setTaskIDs(Integer[] taskIDs) {
        this.taskIDs = taskIDs;
    }

    public void setTaskDurations(Integer[] taskDurations) {
        this.taskDurations = taskDurations;
    }

    public void setTaskStatuses(String[] taskStatuses) {
        this.taskStatuses = taskStatuses;
    }
    
    //getters

    public String[] getDevelopers() {
        return developers;
    }

    public String[] getTaskNames() {
        return taskNames;
    }

    public Integer[] getTaskIDs() {
        return taskIDs;
    }

    public Integer[] getTaskDurations() {
        return taskDurations;
    }

    public String[] getTaskStatuses() {
        return taskStatuses;
    }
    

    public TaskManager() {
        // Initialize arrays with test data
        developers = new String[] {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        taskNames = new String[] {"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        taskIDs = new Integer[] {1, 2, 3, 4};
        taskDurations = new Integer[] {5, 8, 2, 11};
        taskStatuses = new String[] {"To Do", "Doing", "Done", "To Do"};
    }

    // Method to display tasks with status "Done"
    public void displayDoneTasks() {
        String message = "Tasks with status 'Done':\n";
        for (int i = 0; i < taskStatuses.length; i++) {
            if (taskStatuses[i].equals("Done")) {
                message += "Developer: " + developers[i] + ", Task Name: " + taskNames[i] + ", Task Duration: " + taskDurations[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, message);
    }

    // Method to display task with longest duration
    public void displayLongestTask() {
        int maxDurationIndex = 0;
        for (int i = 1; i < taskDurations.length; i++) {
            if (taskDurations[i] > taskDurations[maxDurationIndex]) {
                maxDurationIndex = i;
            }
        }
        String message = "Task with longest duration:\nDeveloper: " + developers[maxDurationIndex] + ", Task Duration: " + taskDurations[maxDurationIndex];
        JOptionPane.showMessageDialog(null, message);
    }

    // Method to search for task by name
    public boolean searchTaskByName() {
        String taskName = JOptionPane.showInputDialog("Enter task name:");
        for (int i = 0; i < taskNames.length; i++) {
            if (taskNames[i].equals(taskName)) {
                String message = "Task found:\nTask Name: " + taskNames[i] + ", Developer: " + developers[i] + ", Task Status: " + taskStatuses[i];
                JOptionPane.showMessageDialog(null, message);
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found");
        return false;
    }

    // Method to search for tasks by developer
    public boolean searchTasksByDeveloper() {
        String developer = JOptionPane.showInputDialog("Enter developer name:");
        String message = "Tasks assigned to " + developer + ":\n";
        for (int i = 0; i < developers.length; i++) {
            if (developers[i].equals(developer)) {
                message += "Task Name: " + taskNames[i] + ", Task Status: " + taskStatuses[i] + "\n";
            JOptionPane.showMessageDialog(null, message);
            return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found");
        return false;
    }

    // Method to delete task by name
    public boolean deleteTaskByName() {
        String taskName = JOptionPane.showInputDialog("Enter task name to delete:");
      
        for (int i = 0; i < taskNames.length; i++) {
           
            if (taskNames[i].equals(taskName)) {
                // Remove task from arrays
                developers = removeElement(developers, i);
                taskNames = removeElement(taskNames, i);
                taskIDs = removeElement(taskIDs, i);
                taskDurations = removeElement(taskDurations, i);
                taskStatuses = removeElement(taskStatuses, i);
                JOptionPane.showMessageDialog(null, "Task deleted successfully");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found");
        return false;
    }

    // Method to display full report
    public void displayFullReport() {
        String message = "Full report: \n ";
        for (int i = 0; i < taskNames.length; i++) {
            message += "Task ID: " + taskIDs[i] + "\n" + "Task Name: " + taskNames[i] + "\n" + "Developer: " + developers[i] + "\n" + "Task Duration: " + taskDurations[i] + "\n" + "Task Status: " + taskStatuses[i] + " \n ";
        }
        JOptionPane.showMessageDialog(null, message);
    }

    // Helper method to remove element from array
    private <T> T[] removeElement(T[] array, int index) {
        T[] newArray = Arrays.copyOf(array, array.length - 1);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }
    
}
