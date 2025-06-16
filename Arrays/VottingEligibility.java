package Arrays;
import java.util.*;

public class VottingEligibility {
    // Creating  the main method 
    public static void main(String[] args) {
        // Initialize an array age of length 10
        int age[]=new int [10];
        Scanner sc =new Scanner(System.in);

    
        // Taking input age in array
        for(int index=1;index<=10;index++){
            System.out.println("Enter the age of person");
            age[index-1]=sc.nextInt();

        }
        // Check the condition whether a person is eligible to caste the vote 
        for(int i=0;i<=9;i++){
            if(age[i]<0){
                System.out.println("Invalid age");
            }
            else if(age[i]>=18){
                System.out.println("Person is eligible to caste their  vote ");

            }
            else{
                System.out.println("Person is not eligible to caste their vote");
            }
        }

    }
    
}
