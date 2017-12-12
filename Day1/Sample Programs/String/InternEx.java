package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InternEx {
	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String("Hello").intern();
		System.out.println(s1==s2);
		
		

		String s3="HelloWorld";
		System.out.println(s3.indexOf("Mars"));
		System.out.println(s3.indexOf("World"));
		
		System.out.println(s3.substring(s3.indexOf("World")));
		System.out.println(s3.substring(0,s3.length()-s3.indexOf("World")));
		System.out.println(s3.matches(".*World$"));


		
		

		
		
		
		
		
		String s4="Hello";
		
		//System.out.println(s4.substring(70)); //StringIndexOutOfBoundsException
		System.out.println("length:-"+s4.substring(s4.length())); //java api accepts length, returns an empty string
		System.out.println(s4.substring(1,2));  // BOTH ARE 0-BASED INDEXES, SUBTRACT 2-1=1 --> 1 character to extract after starting frm index 1
		
		String s5="This" + 20 + false+ Boolean.valueOf(true);
		System.out.println(s5);
		String s6="This";
		s6.concat(20); // only works with string
				
		
	}
}
