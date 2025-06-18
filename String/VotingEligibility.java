package String;
import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 4: Take user input for number of students (up to 10)
        System.out.print("Enter number of students (max 10): ");
        int n = scanner.nextInt();

        if (n > 10 || n <= 0) {
            System.out.println("Please enter a valid number (1 to 10)");
            return;
        }

        // Generate random ages
        int[] ages = generateRandomAges(n);

        // Check voting eligibility
        String[][] result = checkVotingEligibility(ages);

        // Display results in tabular format
        displayResults(result);
    }

    // Step 1: Generate random 2-digit ages for n students
    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // Generates between 10 and 99
        }

        return ages;
    }

    // Step 2: Check voting eligibility and return a 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "false";
            } else if (age >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // Step 3: Display 2D array in tabular format
    public static void displayResults(String[][] data) {
        System.out.printf("%-10s%-15s\n", "Age", "Can Vote?");
        System.out.println("-----------------------");

        for (String[] row : data) {
            System.out.printf("%-10s%-15s\n", row[0], row[1]);
        }
    }
}
