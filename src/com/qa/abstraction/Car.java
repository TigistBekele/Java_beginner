package com.qa.abstraction;

public class Car extends Vehicle {

	private int wheel;

	public Car(String brand, int mileAge, String color) {
		super(brand, mileAge, color);

	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return "Car [currentid=" + currentid + ", brand=" + brand + ", mileAge=" + mileAge + ", color=" + color + "]";
	}

	@Override
	public void isDrivingfast() {
		System.out.println("This is a car driving speed");

	}

}
