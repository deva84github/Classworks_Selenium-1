package abstractEx;

public class Child extends AbstractTest {

	@Override
	public void someMethod() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void someMethod1() {
		// TODO Auto-generated method stub
		
	}
	
	public Child() {
		super();
		System.out.println("in child const");
	}

	public static void main(String[] args) {
		
		new Child();
	}



}
