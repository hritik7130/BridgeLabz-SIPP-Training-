import java.util.*;
public class area{
public static void main (String []args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the radius:");
double radius=sc.nextInt();

double area= 3.14* radius*radius;
System.out.println("area  is:" +area);
}
}