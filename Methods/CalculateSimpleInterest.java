package Methods;
import java.util.*;
public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Input
        System.out.println("Enter the Priniciple Amount :");
        double principleAmount=sc.nextDouble();
        System.out.println("Enter the Rate :");
        double rate=sc.nextDouble();
        System.out.println("Enter the time  :");
        
        double time=sc.nextDouble();

        simpleInterest(principleAmount, time, rate);
    }
    // Define the function to calculate Simple Interest
    static void simpleInterest(double p,double t,double r){
        double sI=(p*t*r)/100;
        System.out.println("The calculated Simple Interest :" + sI);

    }
    
}
