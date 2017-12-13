

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		LicensedSoftware licensedSoftware=new LicensedSoftware("Seed2 Application","SEED2 Batch","Web Application",1000000000,500.00,"abc-abc-abc","Mukesh","SEED2",new Date("02/03/2017"),new Date("02/03/2018"));
		
		System.out.println(licensedSoftware.toString());
		
		
	}
}
