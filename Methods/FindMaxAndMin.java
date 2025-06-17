package Methods;
import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class FindMaxAndMin {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in );

        System.out.println("Please enter the three numbers");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
       int result1[]=findSmallestAndLargest(number1, number2, number3);
       System.out.println( "Smallet number =" + result1[0]);
       System.out.println( "Largest number =" + result1[1]);

    
    


    }
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int smallest,largest;
        if(number1<number2&&number1<number3){
             smallest=number1;
        }
        else if(number2<number1&&number2<number3){
            smallest=number2;
        }
        else {
            smallest=number3;
        }
        if(number1>number2&&number1>number3){
            largest=number1;
        }
        else if (number2>number1&&number2>number3){
            largest=number2;
        }
        else{
            largest=number3;
        }
        int result []={smallest,largest};
        return result;

    }
    
}
