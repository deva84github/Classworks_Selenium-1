package strings;

/**
 * 3 ways of string comparsion :-
 * equals
 * contentEquals
 * compareTo
 */
public class ContentEqualsEx {

	   public static void main(String args[]) {
	      String str1 = "Not immutable";
	      String str2 = "Strings are immutable";
	      StringBuffer str3 = new StringBuffer( "Not immutable");

	      boolean  result = str1.contentEquals( str3 ); // content equals CHECKS ONLY SEQUENCE OF CHARACTERS
	      System.out.println(result); 					//, also its a method of string class not buffer class, so vice versa not possible
		  
	      result = str2.contentEquals( str3 );
	      System.out.println(result);
	      
	      System.out.println(str1.equals(str3)); // equals check both type and value, thats why we need to
	      												//convert string buffer to string before comparing
	      
	   }
	}