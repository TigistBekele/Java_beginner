package com.qa.inheritance;

public class Person {

//	Attributes
	
	protected String name;
	protected int age;
	protected String city;
	protected boolean likesMovie;
	protected String eyeColor;
	
//Constructor
	
	public Person(String name,int age,String city,boolean likesMovie,String eyeColor) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.likesMovie = likesMovie;
		this.eyeColor = eyeColor;
	}
	
//	public Person(String name,int age,String city,boolean likesMovie,String eyeColor) {
//		this.name = "Joye";
//		this.age = 25;
//		this.city = "St.paul";
//		this.likesMovie = true;
//		this.eyeColor = "Brown";
//	}
	
	public void watchMovie() {

		System.out.println("true");
	}

	public void living(int country) {

		
	}

	public void eye(String color) {

	}
}
