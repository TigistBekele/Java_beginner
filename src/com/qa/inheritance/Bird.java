package com.qa.inheritance;

public class Bird {

//	alt + Shift + S

//	ATRIBUTES
	protected String species;
	protected boolean canfly;
	protected boolean isflying;
	protected int age;
	protected String featherColor;
	protected int numEyes;

	
//	CONSTRACTRE
	public Bird() {
		this.species = species;
		this.canfly = canfly;
		this.age = age;
		this.featherColor = featherColor;
		this.numEyes = numEyes;
		this.isflying = isflying;
	}

	public Bird(String species, boolean canfly, boolean isflying, int age, String featherColor, int numEyes) {

		this.species = "??? -generic";
		this.canfly = true;
		this.age = 1;
		this.featherColor = "black";
		this.numEyes = 2;
		this.isflying = false;

	}

	public Bird(String species, boolean canfly) {

        
		this.species = species;
		this.canfly = canfly;

	}

	public void eat(int food) {

	}

	public void fly(int food) {

	}

	public void speak(int food) {

	}
}
