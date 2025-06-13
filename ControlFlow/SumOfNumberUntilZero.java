package ControlFlow;
import java.util.*;

public class SumOfNumberUntilZero {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total=0.0;
       while(true){
        double value=sc.nextDouble();
        if(value==0){
            break;
        }
        else {
            total=total+value;
        }
        
       }System.out.println("The total value is :" + total);

       
    }
    
}
