package Methods;
import java.util.*;

public class SumOfNaturalNumber {
    // Initialize the main method
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number =sc.nextInt();
        System.out.println(Sum(number));

    }// Creating the method sum 
    public static int Sum(int number){
        int sum=0;
        for(int i=0;i<=number;i++){
            sum+=i;

        }
        return sum;
    }
}
