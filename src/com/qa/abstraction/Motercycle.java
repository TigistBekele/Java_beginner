package com.qa.abstraction;

public class Motercycle extends Vehicle {

	private String type;
	

	public Motercycle(int id, String brand, int mileAge, String color, int year) {
		super(id, brand, mileAge, color, year);
		// TODO Auto-generated constructor stub
	}

	public String getMadeOf() {
		return type;
	}

	public void setMadeOf(String madeOf) {
		this.type = madeOf;
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
        "Model: " +
        this.brand +
        "\n" +
        "Year: " +
        this.year +
        "\n" +
        "Type: " +
        this.type +
        "\n" +
        "color: " +
        this.color +
        "\n"
      );
    }
    
}


