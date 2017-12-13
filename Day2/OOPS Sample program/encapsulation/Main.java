package com.htc.oops.encapsulation;

public class Main {
	public static void main(String[] args) {

		Encapsulation encapsulation=new Encapsulation(1,19,"SEED-2");
		
//		encapsulation.setDay(1);
//		encapsulation.setBatchName("SEED-2");
//		encapsulation.setNoOfTrainees(19);
		
    
		System.out.println("Day: "+encapsulation.getDay());
		System.out.println(encapsulation.getBatchName());
		System.out.println(encapsulation.getNoOfTrainees());
	}
}
