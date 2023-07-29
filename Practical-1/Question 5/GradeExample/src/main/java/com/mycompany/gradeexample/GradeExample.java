package com.mycompany.gradeexample;
public class GradeExample {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            
            default:
                System.out.println("Invalid grade!");
        }
    }
}

