package com.qa.abstraction;

public class Car extends Vehicle {
	
	private int wheel;
	

	public Car(int id, String brand, int mileAge, String color, int year,int wheel) {
		super(id, brand, mileAge, color, year);
		
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

	@Override
	  public String toString() {
	    return (
	      "The Brand of Car is: " +
	      this.brand +
	      "\n" +
	      "Year of Manufacture: " +
	      this.year +
	      "\n" +
	      "Color Of Car: " +
	      this.color+
	      "\n" +
	      "The mileAge of the Car is: " +
	      this.mileAge +
	      "\n"
	    );
	  }
	}

