package ControlFlow;

import java.util.Scanner;

public class RocketCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the countdown starting number: ");
        int counter = scanner.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        
        System.out.println("🚀 Launch!");

        
    }
}
