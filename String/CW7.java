package String;

import java.util.Scanner;

public class CW7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * String s="HELLO$WORLD";
		 * 
		 * String [] arrOfStr = s.split("$"); for(String a:arrOfStr);
		 * 
		 * //char[] a; System.out.println(a);
		 */
		//String[] splited = s.split(" ");
	 
		
			//String str = "Welcome:dear guest"; 
			//String [] arrOfStr1 = str.split(":"); 
		//	for(String a:arrOfStr) 
			//System.out.println(a); 
			
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String ");
		String s=sc.nextLine();
		
		String [] arrOfStr = s.split("\\$");
		for(String x:arrOfStr) 
		System.out.println(x);
		
		
	}
}
