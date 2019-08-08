package String;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

				System.out.println("Enter String ");
				String s=sc.nextLine();
				
				char ch[]=s.toCharArray();
				int count=0;
				for(int i=0;i<s.length();i++) {
					
					if(ch[i]==ch[i]) {
						
						count ++;
					}
				}
				System.out.println(count);

	}

}
