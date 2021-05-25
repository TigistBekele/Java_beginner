package com.qa.abstraction;

public abstract class Vehicle {

//	Attribute
	protected int currentid;
	protected String brand;
	protected int mileAge;
	protected String color;
	protected int year;
	public static int count = 0;

	public Vehicle(String brand, int mileAge, String color) {
		super();
		this.brand = brand;
		this.mileAge = mileAge;
		this.color = color;
		this.currentid = ++count;
	}

	public int getCurrentid() {
		return currentid;
	}

	public void setCurrentid(int currentid) {
		this.currentid = currentid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getMileAge() {
		return mileAge;
	}

	public void setMileAge(int mileAge) {
		this.mileAge = mileAge;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Vehicle.count = count;
	}

	public void isDrivingfast() {
		System.out.println();
	}

}
