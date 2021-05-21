package com.qa.inheritance;

public class Person {

	// Attributes

	protected String name;
	protected int age;
	protected String city;
	protected boolean likesMovie;
	protected String eyeColor;

	// Constructor
	public Person(String name, int age, String city, boolean likesMovie, String eyeColor) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.likesMovie = likesMovie;
		this.eyeColor = eyeColor;
	}

	public Person() {
		this.name = "Joye";
		this.age = 25;
		this.city = "St.paul";
		this.likesMovie = true;
		this.eyeColor = "Brown";

	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

//	Methods

	public void watchMovie(boolean happyTomovie) {
		this.likesMovie = true;

	}

	public void livingPlace() {
		System.out.println(this.city);
	}

	public void eye() {
		System.out.println("the eyecolor of this person is :" + eyeColor);
	}
	public void speak() {
		System.out.println("Hello I can speak!!!!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
