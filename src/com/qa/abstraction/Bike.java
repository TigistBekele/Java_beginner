package com.qa.abstraction;

public class Bike extends Vehicle {

	private int workyr;
	private boolean run; 
	
	

	public Bike(int id, String brand, int mileAge, String color, int year,boolean run) {
		super(id, brand, mileAge, color, year);
		// TODO Auto-generated constructor stub
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
	      this.color +
	      "\n" +
	      "Can it run?: " +
	      this.run +
	      "\n"
	    );
	  }
	}


