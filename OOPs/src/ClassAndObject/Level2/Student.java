package ClassAndObject.Level2;

import java.util.Scanner;

 public class Student {
    String name;
    int rollNumber;
    double marks;

   // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }


    String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F (Fail)";
        }
    }

   
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number:  "  + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      :  " + calculateGrade());
    }
}

    class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter Student Name:  ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        
        Student student = new Student(name, rollNumber, marks);
        System.out.println();
        student.displayDetails();

        
    }
}
