package ClassAndObject.Level2;

import java.util.*;
public class Default{
	int age;
	int price;
	String name ;
	
	Default(int n,int p,String m){
		age=n;
		price=p;
		name=m;
		
	}
	public static void main(String []args) {
		System.out.println("Enter the age of the student");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the price of the book");
		int m=sc.nextInt();
		System.out.println("Enter the name  of the student");
		String str=sc.next();
		
		
		
		Default df =new Default(n,m,str);
		System.out.println(df.age);
		System.out.println(df.price);
		System.out.println(df.name );
			
	}
	
}