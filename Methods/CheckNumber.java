package Methods;
import java.util.*;

public class CheckNumber {
    // Initialize the main method 
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    // Input
        int number=sc.nextInt();
       System.out.println(checkNumber(number)) ;
    }
    //Creating a method checkNumber 
    public static int checkNumber(int number){
        if(number>0){
            return 1;
        }
        else if(number<0){
            return -1;
        }
        else {
            return 0;


        }
    }
    
}
