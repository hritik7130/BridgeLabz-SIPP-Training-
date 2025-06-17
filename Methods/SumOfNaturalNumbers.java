package Methods;
import java.util.*;
public class SumOfNaturalNumbers{
    public static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    // Formula method
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a number greater than 0.");
        } else {
            int recSum = recursiveSum(n);
            int formSum = formulaSum(n);

            System.out.println("Recursive Sum = " + recSum);
            System.out.println("Formula Sum   = " + formSum);

            if (recSum == formSum) {
                System.out.println("Both sums are equal. ");
            } else {
                System.out.println("Sums are not equal. ");
            }
        }


    }
}