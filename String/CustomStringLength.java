package String;

import java.util.Scanner;

public class CustomStringLength {

    // Method to calculate string length without using length()
    public static int getLength(String str) {
        int count = 0;

      
        try {
            while (true) {
                str.charAt(count);  
                count++;           
            }
        } catch (StringIndexOutOfBoundsException e) {
            
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a word: ");
        String input = scanner.next(); 

        // get custom length
        int customLength = getLength(input);

        // Get inbuilt length
        int builtInLength = input.length();

        // Display results
        System.out.println("Custom calculated length: " + customLength);
        System.out.println("Built-in length: " + builtInLength);
        System.out.println("Do they match? " + (customLength == builtInLength));
    }
}
