package String;

public class CW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Deepak";
		String s1="Raj"; 
		String s5="abc";
		String s3=new String("Raja");
		System.out.println("equals()::"+s.equals(s1));
		System.out.println("contentEquals::"+s.contentEquals("progaming"));
		System.out.println("equalsIgnoreCase::"+s.equalsIgnoreCase("deepak"));
		String s4=new String("abc");
	//	System.out.println("::"+s==s4);
		System.out.println("refers to instance created in nonpool"+s==s4);
		/*
		 * if(s==s1) { System.out.println("String is same ");
		 * 
		 * } else { System.out.println("String is not same "); }
		 */	
		
	
		String s6="Harry";
		String s7="Harry";
		System.out.println(":::"+s6.compareTo(s7));
		if(s6.compareTo(s7)<0) {
			System.out.println("s6 comes first");
		}
		else if(s6.compareTo(s7)>0) {
			System.out.println("s7 comes first");
		}
	}
	

}
