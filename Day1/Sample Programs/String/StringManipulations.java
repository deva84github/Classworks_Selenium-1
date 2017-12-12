package strings;
/**
 * 
 * 
 *
 */
public class StringManipulations {

	public static void main(String args[])
	{
		String abc="HI this is nitish";
		String a[]=abc.split(" ");System.out.println(a[3]);
		
		
		String b="hi"; String c="hi";
		System.out.println("abc".compareTo("lmn")); // negative, if smaller
		System.out.println("lmn".compareTo("abc")); // positive, if greater
		System.out.println(b.compareTo(c));			//0 equal
		
		
		subStringS();
		trimString();
		
		String lmn="";
		System.out.println(lmn.split(";").length);
		
		
/*		for(char c:abc) // will give error
		{
			
		}*/
		char ch[]="abc".toCharArray(); // we need to convert string to char array
		
	}
	
	/**
	 * Returns a string that is a substring of this string.
	 *  The substring begins at the specified beginIndex and extends to the character at index endIndex - 1. 
	 * Thus the length of the substring is endIndex-beginIndex
	 */
	public static void subStringS()  // static else main would not be able to access 
	{
		String x="0123456789";
		System.out.println(x.substring(5));
		System.out.println(x.substring(5, 8)); //5-8 =3 , means 3 characters from 5th index
		
	}
	
	
	public static void trimString()  // static else main would not be able to access 
	{
		String x="       hi  2space one space   ";
		System.out.println(x.trim()+"x");
		
		//Only leading and trailing white spaces are removed
		//not the ones that are in between
	}
}
