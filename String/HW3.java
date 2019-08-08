package String;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		str = sc.nextLine();

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
