package com.qa.encapsulation;

public class Cat {

	private String nameOfCat;
	private int age;
	private String color;
	
	
	public Cat(String nameOfCat, int age, String color) {
		this.nameOfCat = nameOfCat;
		this.age = age;
		this.color = color;
	}



	public String getNameOfCat(String loveIt) {
		
		if(loveIt.equals("given name")) {
			return this.nameOfCat;
		}else {
			return "I don't like it!"; 
		}
		
	}


	public void setNameOfCat(String newnameOfCat) {
		this.nameOfCat = newnameOfCat;
	}


	public int getAge() {
		return this.age;
	}


	public void setAge(int newage) {
		this.age = newage;
	}


	public String getColor() {
		return this.color;
	}


	public void setColor(String newcolor) {
		this.color = newcolor;
	}
	
	
}
