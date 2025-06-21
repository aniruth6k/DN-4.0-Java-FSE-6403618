package test;

import model.Employee;
import service.EmployeeManager;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee("E001", "Alice", "Manager", 70000));
        manager.addEmployee(new Employee("E002", "Bob", "Developer", 50000));
        manager.addEmployee(new Employee("E003", "Charlie", "HR", 40000));

        System.out.println("All Employees:");
        manager.displayAll();

        System.out.println("\nSearch E002:");
        System.out.println(manager.searchEmployee("E002"));

        manager.deleteEmployee("E002");

        System.out.println("\nAfter Deletion:");
        manager.displayAll();
    }
}
