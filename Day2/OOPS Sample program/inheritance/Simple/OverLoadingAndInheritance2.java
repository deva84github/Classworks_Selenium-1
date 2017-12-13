package inheritance;


/**
 * IF we have a method in base class which is also declared in child class with identical arguments
 * its visibility cannot be reduced nor its return type

 *
 */
public class OverLoadingAndInheritance2 extends OverLoadingAndInheritance1{
	/*private*/ public int abc()
	{
		System.out.println("parent");
		return 1;
	}
	
	public String abc(int a)
	{
		System.out.println("parent");
		return "";
	}
	
	@Override
	public OverLoadingAndInheritance2 ParentClassReutned()
	{
		System.out.println("child class object is return type");
		return new OverLoadingAndInheritance2();
	}
	
	public static void main(String[] args) {
		OverLoadingAndInheritance2 o=new OverLoadingAndInheritance2();
		o.abc();
		o.abc(1);
	}

}
