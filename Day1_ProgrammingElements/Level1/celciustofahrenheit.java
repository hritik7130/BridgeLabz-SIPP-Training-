import java.util.*;
public class celciustofahrenheit{
public static void main (String []args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the temperature:");
int celsius=sc.nextInt();
int fahrenheit=(celsius * 9/5) + 32;
System.out.println("temerature in fhrenheit:" +fahrenheit);
}
}