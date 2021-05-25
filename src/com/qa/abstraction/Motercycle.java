package com.qa.abstraction;

public class Motercycle extends Vehicle {

	private int mileAge;
	public boolean isNew;

	public Motercycle(String brand, int mileAge, String color, boolean isNew) {
		super(brand, mileAge, color);
		this.isNew = isNew;

	}

	public int getMileAge() {
		return mileAge;
	}

	public void setMileAge(int mileAge) {
		this.mileAge = mileAge;
	}

	@Override
	public String toString() {
		return "Motercycle [currentid=" + currentid + ",mileAge=" + mileAge + ",  brand=" + brand + ", color=" + color
				+ ", isNew=" + isNew + "]";
	}

	@Override
	public void isDrivingfast() {
		System.out.println("This is a Motercycle speed");

	}

}
