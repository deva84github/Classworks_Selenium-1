package abstracts;

public class Hero extends Bike{
	
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hero(String color, String type) {
		super(color, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void price() {
		System.out.println("Price: 50,000.00");
		
	}
		
	
}
