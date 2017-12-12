package strings;



public class StringBufferExample{
	
  public static void main(String args[]) {
  String s1=new String("Nitish");
  String s2=s1;
  System.out.println(s1==s2);
  
  s2=s2+" "+s1; // here a new string is created at a new address and saved to s2
  System.out.println("s1 is :"+s1+"\n"+"s2 is :"+s2);
  System.out.println(s1==s2);
  
 
  StringBuffer sb1=new StringBuffer("Nitish");
  StringBuffer sb2=sb1;
  //sb2=sb2+sb1; // operator undefined for ..
  sb2=sb2.append(" "+sb1);
  System.out.println("sb1 is :"+sb1+"\n"+"sb2 is :"+sb2);
  System.out.println(new StringBuilder("abc").equals(new StringBuilder("abc")));
  System.out.println(new StringBuilder("abc")==(new StringBuilder("abc")));
  //StringBuilder does not override Object class's equals method unlike String

  //StringBuffer sb3="sb3"  // will give error,Cannot convert from String to Buffer
  //StringBuffer sb3=(StringBuffer)"sb3";  //Cannot cast from String to Buffer
  sbInsert();
  
   }
  
  public void sbAppend()
  {
	  //it takes arguments that can be boolean,char,int,long,float,double,and others
	  //start index is 0-based,end index is 1-based
	  //String doesnt have append method,it has concat method
	  
	  }

  
  public static void sbInsert()
  {
	  // insert takes arguments that can be boolean,char,int,long,float,double,and others and not in StringBuffer()
	  
	  
	  StringBuilder sb3=new StringBuilder(01234); //incorrect
	  System.out.println("sb3:-"+sb3);
	  System.out.println(sb3.insert(1, "--"));
	  
	  //the above statement will give an error: index is out of range
	  //new StringBuilder(int capacity) - Constructs a string builder with no characters in it and an initial capacity specified by the capacity argument
	  
	  //StringBuilder sb3=new StringBuilder(5.3);  // compilation error
	  StringBuilder sb1=new StringBuilder("01234567");
	  System.out.println(sb1.insert(4, "----")); //insert at index 4, and not after index 4, where the index is 0 based
	  
	  StringBuilder sb2=new StringBuilder("01234567");
	  System.out.println(sb2.insert(4, 1111));
	  
	  
	  }
  
  /**
   * Only place I see for a StringBuffer is console like output and various logging utility: 
   * many thread may output in conflict.
   */
  
}