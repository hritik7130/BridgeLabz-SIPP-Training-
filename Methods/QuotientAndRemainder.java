package Methods;
import java.util.*;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        int devisor=sc.nextInt();
        
        int result[]=findRemainderAndQuotient(number, devisor);
        System.out.println("Quotient is :"+ result[0]);
        System.out.println("Reaminder  is :"+ result[11]);

    }
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int result[]=new int[2];
         result[0]=number/divisor;
         result[1]=number%divisor;
         return result;

    }
    
}
