package String;

import java.util.Scanner;

public class HW10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string with with spaces");
		String str=sc.nextLine();
		
		System.out.println(str.trim());
		
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=' '){
				System.out.print(ch[i]);
			}
		}
	}
}
