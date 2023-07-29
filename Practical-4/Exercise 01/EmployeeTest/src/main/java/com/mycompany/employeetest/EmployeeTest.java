package com.mycompany.employeetest;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee bogdan = new Employee();
        Employee bird = new Employee();

        bogdan.setEmpID(101);
        bogdan.setEmpName("Mr. Bogdan");
        bogdan.setEmpDesignation("Software Engineer");

        bird.setEmpID(102);
        bird.setEmpName("Ms. Bird");
        bird.setEmpDesignation("HR Manager");

        System.out.println("Employee ID: " + bogdan.getEmpID());
        System.out.println("Employee Name: " + bogdan.getEmpName());
        System.out.println("Employee Designation: " + bogdan.getEmpDesignation());

        System.out.println("\nEmployee ID: " + bird.getEmpID());
        System.out.println("Employee Name: " + bird.getEmpName());
        System.out.println("Employee Designation: " + bird.getEmpDesignation());
    }
}

