package test;

import model.Task;
import service.TaskManager;

public class TaskTest {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task("T001", "Design UI", "Pending"));
        manager.addTask(new Task("T002", "Write API", "In Progress"));
        manager.addTask(new Task("T003", "Test Module", "Pending"));

        System.out.println("All Tasks:");
        manager.traverseTasks();

        System.out.println("\nSearch T002:");
        System.out.println(manager.searchTask("T002"));

        manager.deleteTask("T002");

        System.out.println("\nAfter Deletion:");
        manager.traverseTasks();
    }
}
