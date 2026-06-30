package DesignPattern;
import java.util.Scanner;
class Student {
	String name;
	int marks;
	
	Student(String name, int marks){
		this.name = name ;
		this.marks = marks;
		
	}
}
class GradeService {
	void calculateGrade (Student s) {
		if(s.marks >= 50)
			System.out.println(s.name+"passed");
		else
			System.out.println(s.name+"failed");
			

	}
}
class StudentRepository{
	void save (Student s) {
		System.out.println("Saving " + s.name +" to database...");
		
	}
}

class Reportprinter {
	void print (Student s) {
		System.out.println ("Report: " + s.name + " Scored " + s.marks);
	}
}

public class Cohesionex {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("enter student name:");
		String name = sc.nextLine();
	    System.out.print("Enter marks :");
	    int marks = sc.nextInt();
	    Student s = new Student(name, marks);
	    new GradeService().calculateGrade(s);
	    new StudentRepository().save(s);
	    new Reportprinter().print(s);
	    sc.close();
	    
	}
	
}
