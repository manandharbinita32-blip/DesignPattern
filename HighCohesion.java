package DesignPattern;

import java.util.Scanner;

// Model Class
class HCStudent {
    String name;
    int marks;

    public HCStudent(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

// Business Logic
class HCGradeService {

    public void calculateGrade(HCStudent student) {
        if (student.marks >= 50) {
            System.out.println(student.name + " Passed");
        } else {
            System.out.println(student.name + " Failed");
        }
    }
}

// Database Logic
class HCStudentRepository {

    public void save(HCStudent student) {
        System.out.println("Saving " + student.name + " to database...");
    }
}

// Report Logic
class HCReportPrinter {

    public void print(HCStudent student) {
        System.out.println("Report: " + student.name + " scored " + student.marks);
    }
}

// Main Class
public class HighCohesion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        HCStudent student = new HCStudent(name, marks);

        HCGradeService gradeService = new HCGradeService();
        gradeService.calculateGrade(student);

        HCStudentRepository repository = new HCStudentRepository();
        repository.save(student);

        HCReportPrinter printer = new HCReportPrinter();
        printer.print(student);

        sc.close();
    }
}