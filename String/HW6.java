package String;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("Enter a word whose occurace you want or find");
		String word=sc.nextLine();
		
		String arr[]=str.split(" ");
		for(String s:arr){
			System.out.println(s);
		}
		
		
		for(int i=0;i<arr.length;i++){
			if(arr[i].equals(word)){
				System.out.println("The first occurance of "+word+" is at "+i+" position");
				break;
			}else{
				System.out.println("no word is found");
				//break;
			}
		}
	}

}
