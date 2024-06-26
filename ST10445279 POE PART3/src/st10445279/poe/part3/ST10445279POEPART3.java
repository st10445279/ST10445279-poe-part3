/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10445279.poe.part3;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class ST10445279POEPART3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        while (true) {
            String[] options = {"Display Done Tasks", "Display Longest Task", "Search Task by Name", "Search Tasks by Developer", "Delete Task by Name", "Display Full Report", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Task Manager", "Task Manager", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    taskManager.displayDoneTasks();
                    break;
                case 1:
                    taskManager.displayLongestTask();
                    break;
                case 2:
                    taskManager.searchTaskByName();
                    break;
                case 3:
                    taskManager.searchTasksByDeveloper();
                    break;
                case 4:
                    taskManager.deleteTaskByName();
                    break;
                case 5:
                    taskManager.displayFullReport();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
        
    
    }
    
}
