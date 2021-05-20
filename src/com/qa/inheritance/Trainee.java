package com.qa.inheritance;

public class Trainee extends Person {
	
	//	Attribute
	protected double bursary;
	protected String subjectsLearned;
	
	
//	Constructor
	
	public Trainee() {
		super();
		this.bursary = bursary;
		this.subjectsLearned = subjectsLearned;
		
	}
	
	public Trainee(double bursary,String subjectsLearned) {
		super(name);
		this.bursary = 100.99;
		this.subjectsLearned = "Maths";
	}
	
	
	public String addSubject() {
		return "added new subject" + subjectsLearned;
	}
	
	
}
