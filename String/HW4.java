package String;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string with white spaces");
		str=sc.nextLine();
		
		System.out.println("Resultant string (without white spaces)\n"+str.trim());
		
	}

}
