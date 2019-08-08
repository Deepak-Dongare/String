package String;

import java.util.Scanner;

public class CW10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=sc.next();
	char ch[]=s.toCharArray();
		for(int left =0,right=ch.length-1;left<right;left++,right--) {
			
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			
			
			
		}
		System.out.println("Enter the array");
		for(int i = 0;i<ch.length;i++) {
		
			System.out.println(ch[i]);
			String s1=ch.toString();
			
			//System.out.println(s1[i]);
		}
		
		
	}

}
