import java.util.*;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Calculating quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Output
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + 
                           " of two numbers " + number1 + " and " + number2);
        
        scanner.close();
    }
}