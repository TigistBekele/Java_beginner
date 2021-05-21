package com.qa.abstraction;

public abstract class Vehicle {

//	Attribute
	protected int id;
	protected String brand;
	protected int mileAge;
	protected String color;
	protected int year;
	
	
	public Vehicle(int id, String brand, int mileAge, String color, int year) {
		super();
		this.id = id;
		this.brand = brand;
		this.mileAge = mileAge;
		this.color = color;
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
