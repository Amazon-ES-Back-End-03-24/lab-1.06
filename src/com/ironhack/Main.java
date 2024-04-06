package com.ironhack;

import com.ironhack.classes.Employee;
import com.ironhack.classes.Intern;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the details for employee " + (i + 1) + ":");
            System.out.print("Type (Intern/Employee): ");
            String type = scanner.nextLine().trim();
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Salary: ");
            int salary = Integer.parseInt(scanner.nextLine());


            if ("Intern".equalsIgnoreCase(type)) {
                Intern intern = new Intern(name, email, age, salary);
                employees.add(intern);
            } else if ("Employee".equalsIgnoreCase(type)) {
                employees.add(new Employee(name, email, age, salary));
            } else {
                System.out.println("Invalid type entered. Creating an Employee by default.");
                employees.add(new Employee(name, email, age, salary));
            }
        }
        scanner.close();

        writeFile(employees);
    }

    public static void writeFile(List<Employee> employees) throws IOException {
        File file = new File("employees.txt");
        FileWriter writer = new FileWriter(file);

        for (Employee employee : employees) {
            writer.write(employee.toString() + "\n");
        }
        writer.close();

        System.out.println("Employee details have been saved to " + file.getAbsolutePath());
    }
}