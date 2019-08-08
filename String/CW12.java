package String;

import java.util.Scanner;

public class CW12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be toggled");
		s1 = sc.nextLine();
		char c[] = s1.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 65 && c[i] <= 90) {
				c[i] = (char) (c[i] + 32);
			} else {
				c[i] = (char) (c[i] - 32);
			}
		}

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
	}

}
