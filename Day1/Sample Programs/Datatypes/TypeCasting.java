package dataTypes;
/*
 * Type conversion(as the name suggests it converts one type to other) is of two types
 * impicit - widening conversion
 * explicit -using casting -narrowing conversion
 * 
 * Typecasting is just taking a pen and writing "this is now a int" on the variable,
 * conversion is actually convert the content to the desired type so the value keeps having a sense.
 * So typecasting is NOT a subtype of type conversion,its a means to achieve explicit typeconversion
 * 
 * 
 * 
 * 
 * TYPE CONVERSION IS POSSIBLE in 2 ways:- NORMAL WAY AND WRAPPER CLASSES I.byteValue()
 */


public class TypeCasting {
	public static void main(String args[])
	{
		byte b; // rem this is byte and not boolean , -128 to +127
		int i=270;
		double d=128.28;
		b=(byte)i;
		System.out.println(b);
		
		double dd=1000.00+(7d/100);
		System.out.println(dd);
		
		dd=1000.00+((double)7/100);
		System.out.println(dd);
		
		dd=1000.00+((double)(7/100));
		System.out.println(dd);
		
		dd=1000.00+(7/100.0);
		System.out.println(dd);
		
		dd=1000.15+7;
		System.out.println(dd);
		
		dd=1000+7;
		System.out.println(dd);
		
		
	}
}
