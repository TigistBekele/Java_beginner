package com.qa.inheritance;

public class Employee extends Person {

	// Attribute
	private double annualSalary;
	private double weeklySalary;

//	Method overriding
	public void speak() {
		System.out.println("yup");
	}

//	Constructor

	public Employee(String name,int age,double annualSalary) {
		super(name,age);
		this.annualSalary = annualSalary;
		
	}
		
	
public double calculateWeeklySalary() {
		return weeklySalary = annualSalary / 52.0;
	}

//	GET / SET
	
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
