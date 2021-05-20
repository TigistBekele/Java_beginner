package com.qa.abstraction;

public class Car extends Vehicle {
	
	private int wheel;
	
	public Car(String brand, int mileAge, String color, int wheel) {
		super(brand, mileAge, color);
	}


	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}



	@Override
	public void left() {
		 System.out.println("the car works left"); 
	}
	@Override
	public void ride() {
	
		System.out.println("the car works ride"); 
	}

	@Override
	public void stop() {
		System.out.println("STOP"); 

	}

}
