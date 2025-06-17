package Methods;
import java.util.*;

public class TriangularPark {
    //Initialize the main method 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        // Find the perimeter of triangle

        int perimeterOfTriangle=side1+side2+side3;
        numberOfRound(perimeterOfTriangle);

    }
    // creating the method for numberOf round
    public static void numberOfRound( int perimeterOfTriangle){

        double numberofRounds=5000/perimeterOfTriangle;
        System.out.println(numberofRounds);
    }
    
}
