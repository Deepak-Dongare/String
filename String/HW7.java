package String;

import java.util.Scanner;

public class HW7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the string");
		String str=sc.nextLine();
		
		char ch;
		System.out.println("Enter the charachter whose occurace you want or find");
		ch = sc.next().charAt(0);
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i))
				count++;
		}
		System.out.println("Occurance of " + ch + " = " + count);
	}

}
