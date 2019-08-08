package String;

public class PS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer str=new StringBuffer("This is StringBuffer ");
		System.out.println(str.insert(21, "object"));
		
		StringBuffer str1=new StringBuffer("This is a sample program");
		str1.append(str);
		System.out.println(str1.reverse());
		System.out.println(str1.reverse());
		
		System.out.println(str1.replace(14,20 , "builder"));
		System.out.println(str1.delete(21, 28));
	}

}
