package ControlFlow;

import java.util.Scanner;

public class RocketCountDownUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the starting countdown number: ");
        int counter = scanner.nextInt();

       
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

      
        System.out.println("Lift Off!");
        
     
    }
}
