package com.mycompany.employeetest;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setName("John");
        emp.setAge(30);
        emp.setSalary(50000.0);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}

