package Methods;

import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a year : ");
        int year = scanner.nextInt();

      
        if (year < 1582) {
            System.out.println("Invalid input. The year must be 1582 or later.");
        } else {
          
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

      
    }

    // Method to check leap year condition
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
