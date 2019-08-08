package String;

import java.util.Scanner;

public class HW9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println("Enter the charachter whose occurance u wanna remove");
		char ch = sc.next().charAt(0);

		char chr[] = str.toCharArray();

		for (int i = 0; i < chr.length; i++) {
			if (chr[i] != ch) {
				System.out.print(chr[i]);
			}
		}

	}
}

/*
 * String str1 = null; for (int i = 0; i < str.length(); i++) { if (ch ==
 * str.charAt(i)) { str1=str.replace(ch, ' '); System.out.println(str1); break;
 * } }
 */
// System.out.println(str1);

/*
 * char chr[]=str.toCharArray(); for(int i=0;i<chr.length;i++){ for(int
 * j=i+1;j<chr.length;j++){ if(chr[i]==32){ chr[]=chr[j++]; } } }
 * 
 * char chr[]=str.toCharArray();
 * 
 * for(int i=0;i<chr.length;i++){ System.out.println(chr[i]); if(chr[i]=='a'){
 * System.out.print(chr[i]); chr[i]=chr[i+1];
 * 
 * } }
 * 
 * for(int i=0;i<str.length();i++){ System.out.print(chr[i]); }
 */