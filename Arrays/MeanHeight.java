package Arrays;

import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        //  Create an array to store heights
        double[] heights = new double[11];
        double sum = 0.0;

        // Input heights from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of 11 football players");

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];  
        }

      // Calculate mean height
        double mean = sum / heights.length;

        
        System.out.printf("The mean height of the football players is ", mean);

       
    }
}
