package Methods;

import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        } else if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] studentAges = new int[10];

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();

            boolean canVote = checker.canStudentVote(studentAges[i]);

            if (studentAges[i] < 0) {
                System.out.println("Invalid age entered. Cannot vote.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is NOT eligible to vote.");
            }
        }

      
    }
}
