package com.qa.abstraction;

public abstract class Vehicle {

//	Attribute
	
	private String brand;
	private int mileAge;
	private String color;
	
	
	public Vehicle(String brand, int mileAge, String color) {
		super();
		this.brand = brand;
		this.mileAge = mileAge;
		this.color = color;
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
	
 
	
	abstract void left();
	abstract void ride();
	abstract void stop();
	
	
	public void fast() {
		System.out.println("fast fast fast");
	}
	
}
