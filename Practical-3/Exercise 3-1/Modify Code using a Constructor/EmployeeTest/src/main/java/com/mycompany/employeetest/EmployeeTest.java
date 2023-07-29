package com.mycompany.employeetest;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 30, 50000.0);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}

