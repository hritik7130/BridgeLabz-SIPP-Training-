package Arrays;

import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
       // Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

       // Define array and index
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

       
        while (number != 0) {
            int digit = number % 10;
            digits[index] = digit;
            index++;

            if (index == maxDigit) {
                break;
            }

            number /= 10;
        }

        //  Find the largest and second largest digit
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        
        System.out.println("Digits entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit: Not available (all digits are the same)");
        }

        
    }
}

