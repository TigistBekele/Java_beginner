package com.qa.inheritance;

public class Employee extends Person {

private static Object name;
	//	Attribute
	protected double annualSalary;
	protected double weeklySalary;
	
	
//	Constructor
	

	public Employee(String name, int age, String city, boolean likesMovie, String eyeColor, double annualSalary,
		double weeklySalary) {
	super(name, age, city, likesMovie, eyeColor);
	this.annualSalary = annualSalary;
	this.weeklySalary = weeklySalary;
}

	public double calculateWeeklySalary(double annualSalary,double weeklySalary) {
		return annualSalary / 52 ;
	}

	public static Object getName() {
		return name;
	}

	public static void setName(Object name) {
		Employee.name = name;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
}
