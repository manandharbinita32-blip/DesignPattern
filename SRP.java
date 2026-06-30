package DesignPattern;

// Student Model
class SRPStudent {
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;

    public SRPStudent(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public String getName() {
        return name;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }
}

// Marks Calculator
class SRPMarksCalculator {

    public double calculatePercentage(SRPStudent student) {
        int total = student.getMarks1() + student.getMarks2() + student.getMarks3();
        return (total / 300.0) * 100;
    }
}

// Report Printer
class SRPReportPrinter {

    public void printReport(SRPStudent student, double percentage) {
        System.out.println("----- Student Report -----");
        System.out.println("Name: " + student.getName());
        System.out.println("Percentage: " + percentage + "%");
    }
}

// Main Class
public class SRP {

    public static void main(String[] args) {

        SRPStudent student = new SRPStudent("John", 85, 90, 95);

        SRPMarksCalculator calculator = new SRPMarksCalculator();
        double percentage = calculator.calculatePercentage(student);

        SRPReportPrinter printer = new SRPReportPrinter();
        printer.printReport(student, percentage);
    }
}