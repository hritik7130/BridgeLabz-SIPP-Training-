package Methods;
import java.util.Scanner;

public class NumberCheck {

   
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    
    public static int compare(int num1, int num2) {
        if (num1 > num2)
            return 1;
        else if (num1 < num2)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (isPositive(numbers[i])) {
                System.out.print("Number is positive and ");
                if (isEven(numbers[i])) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println("Number is negative.");
            }
        }

        // Compare first and last elements
        int result = compare(numbers[0], numbers[4]);
        System.out.print("Comparison of first and last elements: ");
        if (result == 1) {
            System.out.println("First number is greater than last.");
        } else if (result == -1) {
            System.out.println("First number is less than last.");
        } else {
            System.out.println("First and last numbers are equal.");
        }

    }
}
