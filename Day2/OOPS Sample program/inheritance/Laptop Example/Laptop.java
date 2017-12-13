package com.htc.corejava.inheritance.day2;

public class Laptop {
	private double price;
	private String model;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(double price, String model) {
		super();
		this.price = price;
		this.model = model;
	}
	
	public void getDetails(){
		System.out.println("Model No:"+getModel());
		System.out.println("Price: "+getPrice());
	}
}
