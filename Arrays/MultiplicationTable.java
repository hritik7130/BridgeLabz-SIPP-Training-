package Arrays;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //  Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        //  Define an array to store the results
        int[] multiplicationResult = new int[4]; 

        // Step 3: Calculate the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        //  Display the result
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

       
    }
}
