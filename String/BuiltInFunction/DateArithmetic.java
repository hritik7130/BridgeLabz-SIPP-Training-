package String.BuiltInFunction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

   
        LocalDate date = LocalDate.parse(inputDate, formatter);

       
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

       
        System.out.println("Final date after arithmetic: " + newDate.format(formatter));
    }
}
