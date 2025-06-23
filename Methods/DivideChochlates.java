package Methods;
import java.util.*;

public class DivideChochlates {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int numberOfChochlates=sc.nextInt();
        int numberOfStudents=sc.nextInt();
        int [] result=findRemainderAndQuotient(numberOfChochlates, numberOfStudents);
        System.out.println( "The number of chochlates each student get :" +result[0]);
        System.out.println("The number of remaining chochlates :"+result[1]);

    }
    public static int[] findRemainderAndQuotient(int number, int divisor){
        
            int[] result = new int[2];
            result[0] = number / divisor;  // Quotient
            result[1] = number % divisor;  // Remainder
            return result;
        
    }
    
}
