package Arrays;
import java.util.Scanner;

public class StoreValuesAndSum {
    public static void main(String[] args) {
        double[] numbers = new double[10]; 
        double total = 0.0;                
        int index = 0;                    

        Scanner scanner = new Scanner(System.in);

        // Step 2: Infinite loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();

            // Step 3: Check if input is 0 or negative
            if (input <= 0) {
                break;
            }

            // Step 4: Break if index reaches 10
            if (index >= 10) {
                System.out.println("Array is full (10 values reached).");
                break;
            }

            // Step 5: Store the number and increment index
            numbers[index] = input;
            index++;
        }

        // Step 6: Calculate sum and print valuesz
       
        for (int i = 0; i < index; i++) {
            System.out.println("Value " + (i + 1) + ": " + numbers[i]);
            total += numbers[i];
        }

        // Step 7: Print total
        System.out.println("Total sum of values: " + total);
    }
}
