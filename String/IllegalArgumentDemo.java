package String;


import java.util.Scanner;

public class IllegalArgumentDemo {

    
    public static void generateException(String input) {
       
        String result = input.substring(5, 2); 
        System.out.println("Substring: " + result);
    }

    
    public static void handleException(String input) {
        try {
            String result = input.substring(5, 2); 
            System.out.println("Handled Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text input: ");
        String input = sc.nextLine();

        
        System.out.println("Generating Exception ");
        try {
            generateException(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception in generateException: " + e.getMessage());
        }

        System.out.println(" Handling Exception ");
        handleException(input);
    }
}
