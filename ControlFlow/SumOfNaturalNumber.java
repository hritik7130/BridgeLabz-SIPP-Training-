package ControlFlow;
import java.util.*;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n=sc.nextInt();
        int sumbyloop=0;
        for(int i=1;i<=n;i++){
            sumbyloop=sumbyloop+i;
        }
        int sumbyformula=n*(n+1)/2;

        if(sumbyformula==sumbyloop){
            System.out.println("The result was correct");
        
        }
        

    
    }

    
}
