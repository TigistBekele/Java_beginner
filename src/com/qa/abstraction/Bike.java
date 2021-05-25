package com.qa.abstraction;

public class Bike extends Vehicle {

	private int workyr;
	private boolean repaired;

	public Bike(String brand, int mileAge, String color, boolean repaired) {
		super(brand, mileAge, color);
		this.repaired = repaired;

	}

	public int getWorkyr() {
		return workyr;
	}

	public void setWorkyr(int workyr) {
		this.workyr = workyr;
	}

	@Override
	public String toString() {
		return "Bike [currentid=" + currentid + ", repaired=" + repaired + ",  brand=" + brand + ", mileAge=" + mileAge
				+ ", color=" + color + "]";
	}

	@Override
	public void isDrivingfast() {
		System.out.println("This is a bike speed");

	}

}
