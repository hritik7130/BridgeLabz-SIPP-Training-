package Arrays;

import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        //  Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;

        //  Count the digits
        int count = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        //  Store digits in an array
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        //  Create reverse array
        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        
        System.out.print("Reversed number of " + originalNumber + " is: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }
        System.out.println();

       
    }
}
