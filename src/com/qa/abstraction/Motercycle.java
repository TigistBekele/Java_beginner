package com.qa.abstraction;

public class Motercycle extends Vehicle {

	private int mileAge;
	

	public Motercycle(int id, String brand, int mileAge, String color, int year) {
		super(id, brand, mileAge, color, year);
		// TODO Auto-generated constructor stub
	}



	public int getMileAge() {
		return mileAge;
	}



	public void setMileAge(int mileAge) {
		this.mileAge = mileAge;
	}



	@Override
	public void left() {
		System.out.println("hello");

	}

	@Override
	public void ride() {
	 System.out.println("welcome moter");

	}

	@Override
	public void stop() {
		System.out.println("stop moter");

	}
	@Override
    public String toString() {
      return (
        "Tne Brand of Motercycle: " +
        this.brand +
        "\n" +
        "Year of Manufacture: " +
        this.year +
        "\n" +
        "MileAge is: " +
        this.mileAge +
        "\n" +
        "The color Motercycle is: " +
        this.color +
        "\n"
      );
    }
    
}


