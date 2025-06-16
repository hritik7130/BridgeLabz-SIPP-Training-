package Arrays;
import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Create an array to store results
        String[] result = new String[number + 1];

        // Fill the array with FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                result[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                result[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(i);
            }
        }

        // Print the results
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }

       
    }
}

