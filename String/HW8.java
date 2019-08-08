package String;

import java.util.Scanner;

public class HW8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		//System.out.println("UPPERCASE STRING :"+str.toUpperCase());
		//System.out.println("lowercase string :"+str.toLowerCase());
		
		char c[] = str.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 65 && c[i] <= 90) {
				c[i] = (char) (c[i] + 32);
				System.out.print(c[i]);
			} else {
				c[i] = (char) (c[i] - 32);
				System.out.print(c[i]);
			}
		}


	}

}
