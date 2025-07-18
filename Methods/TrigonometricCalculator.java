package Methods;

import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate sin, cos, tan
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);  
        double[] results = new double[3];
        results[0] = Math.sin(radians);  
        results[1] = Math.cos(radians);  
        results[2] = Math.tan(radians);  
        return results;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take angle input from user
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

       
        double[] trigValues = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("For angle " + angle + " degrees:");
        System.out.println("Sine = " + trigValues[0]);
        System.out.println("Cosine = " + trigValues[1]);
        System.out.println("Tangent = " + trigValues[2]);
    }
}