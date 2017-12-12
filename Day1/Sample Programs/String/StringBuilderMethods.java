package strings;

public class StringBuilderMethods {
public static void main(String[] args) {
	StringBuilder s=new StringBuilder("ahello world");
	
	System.out.println(s.append(101));
	
	System.out.println(s.codePointAt(0)); //Returns the character (Unicode code point) at the specified index. 
	
	System.out.println(s.reverse());
	
	s.setCharAt(0, '5');  //sets not inserts
	System.out.println(s);
	
	System.out.println(s.delete(0, 4)); //The substring begins at the specified start and extends to the character at index end - 1 
	
	
	
}
}
