package com.ironhack.classes;

public class Intern extends Employee {
    private final int MAX_SALARY = 20000;

    public Intern(String name, String email, int age, int salary) {
        super(name, email, age, 0);
        setSalary(salary);
    }

    @Override
    public void setSalary(int salary) {
        salary = salary > MAX_SALARY ? MAX_SALARY : salary;

      /*  if (salary > MAX_SALARY){
            salary = MAX_SALARY;
        } else {
            salary = salary;
        }*/

        super.setSalary(salary);
    }
}
