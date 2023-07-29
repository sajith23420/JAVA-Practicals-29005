package com.mycompany.employeetest;
public class Employee {
    private String name;
    private double basicSalary;
    private double bonus;

    public Employee(double bonus) {
        this.bonus = bonus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public double calculateBonusAmount() {
        return basicSalary + bonus;
    }
}

