package String;

import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // This line may throw NumberFormatException
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number inside try block: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Invalid input - " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text input: ");
        String input = sc.nextLine();

        
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred in generateException: " + e.getMessage());
        }

        
        System.out.println("\n--- Handling Exception ---");
        handleException(input);
    }
}

