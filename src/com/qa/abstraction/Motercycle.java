package com.qa.abstraction;

public class Motercycle extends Vehicle {

	private String madeOf;
	
	public Motercycle(String brand, int mileAge, String color,String madeOf) {
		super(brand, mileAge, color);
		// TODO Auto-generated constructor stub
	}

	public String getMadeOf() {
		return madeOf;
	}

	public void setMadeOf(String madeOf) {
		this.madeOf = madeOf;
	}

	@Override
	public void left() {
		System.out.println("hello");

	}

	@Override
	public void ride() {
	 System.out.println("welcome moter");

	}

	@Override
	public void stop() {
		System.out.println("stop moter");

	}

}
