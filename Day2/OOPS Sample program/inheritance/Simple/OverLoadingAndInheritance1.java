package inheritance;

public class OverLoadingAndInheritance1 {

	public String abc()
	{
		System.out.println("parent");
		return "";
	}
	
	public OverLoadingAndInheritance1 ParentClassReutned()
	{
		System.out.println("parent class object is return type");
		return new OverLoadingAndInheritance1();
	}
	
}

/**
if we have a method in a base class and in the child class, we add a method with the same name and same arguments,
then it is bydefault overriden and we cannot reduce its visibility or change return type

**/