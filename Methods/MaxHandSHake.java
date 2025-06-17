package Methods;
import java .util.*;
public class MaxHandSHake {
    // Initialize the main method
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // Input
        System.out.println("Enter the number of students");
        int n= sc.nextInt();

        handShake(n);

    }
    // Creating the method handShake
    static void  handShake(int n){
        int number_of_handShake=(n*(n-1))/2;
        System.out.println("The total number of HandShake :" + number_of_handShake);


    
    }
}
