package abstractEx;


/**Can abstract class have const ?
 * 
 * Since each abstract class will have a concrete subclass,an abstract class have a contructor even though an abst class cannot be instantiated
 */

/** Can interface have const ?
 * 
 *interface must not have a constructor because constructor is usually used to initialize instance variables and interface var are static and final.
 * 
 */

/**Can we mark an abstract method as static ?
 * 
 *1) abstract and static cannot be together for a method because a static method is a class method, which can be directly invoked
 * but since its abstract it will not have method definition
 * 
 *2) concept of abstract is that it needs to be improved upon and for that overriding is necc, and static cant be overriden
 */

/**
 * Abstract class needs to be extended and not implemented
 * 
 * And do not forget to add keyword abstract in the class declaration
 *
 */




public abstract class AbstractTest {

	public AbstractTest() {
		System.out.println("in abstract const");
	}
	
	abstract public  void someMethod(); //interchangeable , similarly static public void
	public abstract  void someMethod1();
	
	public static void main(String[] args) {
		System.out.println("in main");
	}
	
}
