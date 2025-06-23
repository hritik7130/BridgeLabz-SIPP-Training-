package ControlFlow;
import java.util.*;


public class PersonCanVote {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the age of person");
        int age =sc.nextInt();

        if(age>=18){
            System.out.println("The person is eligible for vote ");
        }
        else {
            System.out.println("The person is not eligible for vote ");
        }
        
    }

    
}
