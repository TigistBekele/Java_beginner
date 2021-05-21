package com.qa.abstraction;

public class Car extends Vehicle {
	
	private int wheel;
	

	public Car(int id, String brand, int mileAge, String color, int year,int wheel) {
		super(id, brand, mileAge, color, year);
		// TODO Auto-generated constructor stub
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
	      "Model: " +
	      this.brand +
	      "\n" +
	      "Year: " +
	      this.year +
	      "\n" +
	      "Color: " +
	      this.color+
	      "\n" +
	      " wheel number: " +
	      this.wheel +
	      "\n"
	    );
	  }
	}

