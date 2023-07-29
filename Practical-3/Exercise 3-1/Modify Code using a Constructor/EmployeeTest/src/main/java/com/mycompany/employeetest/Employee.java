package com.mycompany.employeetest;
public class Employee {
    private String name;
    private int age;
    private double salary;

    // Constructor with parameters to set the initial values
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

