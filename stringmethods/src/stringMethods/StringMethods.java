package stringMethods;

public class StringMethods {
	public static void main(String[] args) {
		//string length
		
		String s = "Hello";
		System.out.println(s.length());
		//substring
		String sub=new String("Tutorials");
		System.out.println(sub.substring(5));
		
		//comparision
		String s1 = "Welcome to myworld";
		String s2 ="myworld";
		System.out.println(s2.compareTo(s1));
		
		//isEmpty
		
		String s3 = "";
		System.out.println(s3.isEmpty());
		
		//toLowerCase
		String s4 = "HELLO";
		System.out.println(s4.toLowerCase());
		
		//replace
		
		String s5 = "Hello";
		String replace = s5.replace("H","M");
		System.out.println(replace);
		
		//equals
		
		String s6= "HELLO";
		String s7="hello";
		System.out.println(s6.equals(s7));
		 
		
	}

}
