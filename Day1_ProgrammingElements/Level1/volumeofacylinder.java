import java.util.*;
public class volumeofacylinder{
public static void main (String []args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the height of cylinder:");
int height=sc.nextInt();
System.out.print("enter the radius of cylinder:");
int radius=sc.nextInt();
double volume=3.14*radius*radius*height;
System.out.println("volume is:" +volume);
}
}