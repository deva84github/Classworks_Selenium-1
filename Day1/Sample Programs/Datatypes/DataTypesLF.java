package dataTypes;



public class DataTypesLF {
	public int a=1234567890;  // 10 digit exclusive of _
	public int b=123_456_789_0;  
	
	public static long longL=1234567890123456789L; //Suffix L if more than 10 digit-20 digits
	public static long longL_=123_456_789_012_345_6789L; //no commas
	
	public static  double doubleD=-1.01234567890123456789;
	
	public static  float floatF=-1.0123456789f;  // suffix f,else error since it considers everything as double
	
	public static  float floatFF=1; //no suffix reqd
	
	public static  double doubleDD=12345678901234567890.0123456789; // check syso ,E will be appended
	
public static void main(String args[])
{
	System.out.print("text w/o println");
	System.out.println("-- in println new line comes after the current statement is executed");
	System.out.println();
	System.out.println("Double "+ doubleD); // rounds the last digit -upto 15 digits
	System.out.println("Float "+floatF);   // rounds the last digit -upto 7 digits
	System.out.println("Long "+longL); 
	System.out.println("DoubleDD "+doubleDD);
	System.out.println("FloatFF "+floatFF);
	
	
	double a = 0.1 + 0.1 + 0.1;
	double b = 0.3;
	System.out.println();
	System.out.println(a);System.out.println(b);System.out.println(a == b); 
	
	System.out.println((float)a);

}
}




/*
text w/o println-- in println new line comes after the current statement is executed

Double -1.0123456789012346
Float -1.0123457
Long 1234567890123456789
DoubleDD 1.2345678901234567E19
FloatFF 1.0
 */
