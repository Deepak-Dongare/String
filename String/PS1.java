package String;

public class PS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Welcome to Java World";
		
		System.out.println(str.charAt(5));
		
		if(str.equals("Welcome"))
			System.out.println("Given strings are equal");
		else
			System.out.println("Given strings are not equal");
		
		System.out.println(str.concat(" Let us learn"));
		
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='a'){
				System.out.println("First occurance of 'a' is at position "+i);
			}
		}
		
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='a')
				ch[i]='e';
			
			System.out.print(ch[i]);
		}
		
		System.out.println();
		System.out.println("Substring **"+str.substring(4, 10));
		
		System.out.println("Lowercase **"+str.toLowerCase());
		
	}

}
