package com.qa.abstraction;

public class Bike extends Vehicle {

	private int workyr; 
	
	public Bike(String brand, int mileAge, String color, int workyr) {
		super(brand, mileAge, color);
		
	}

	public int getWorkyr() {
		return workyr;
	}

	public void setWorkyr(int workyr) {
		this.workyr = workyr;
	}

	@Override
	public void left() {
		System.out.println("I wanna go with left");

	}

	@Override
	public void ride() {
		System.out.println("ride is fast");

	}

	@Override
	public void stop() {
		System.out.println("this is STOP sign");

	}

}
