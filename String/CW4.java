package String;

import java.util.Scanner;

public class CW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String  ");
		String a=sc.next();
		System.out.println("Enter String ");
		String b=sc.next();
		
		System.out.println("::"+a==b);
		
		System.out.println("Enter the String to compare new String ");
		String x=sc.next();
		String c =new String (x); 
		System.out.println(a.compareTo(c));
		
		
		
		

	}

}
