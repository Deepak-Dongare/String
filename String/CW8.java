package String;

import java.util.Scanner;

public class CW8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=sc.nextLine();
		
		char a[]=s.toCharArray();
		
		/*
		 * for(char out:a); System.out.println(out);
		 */
		
		for(int i=0;i<s.length();i++) {
			
			System.out.println(a[i]);
			
		}
		
		int count = 0;
		
		System.out.println("Enter Char");
		char chr=sc.next().charAt(0);
				for(int i=0;i<s.length();i++) {
					//for(int j=i+1;j<s.length();j++)
						
			 
					if(a[i]==chr) {
						
						
						count++;
						//break;
					}
			/* System.out.println( count); */
					
					
			
		}
				
				
				System.out.println( count);
				
				
					if(count==0) {

						
						System.out.println("Char not found");
					
				}
				}
		
	

}
