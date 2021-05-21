package com.qa.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Trainee extends Person {
	
	//	Attribute
//	private double bursary;
//	private String subjectsLearned;
//	
	
	private List <String> subjectslearned = new ArrayList<String>();
	
//	Constructor
	
	public Trainee(String name,int age, String city) {
		super(name, age, city);
//		this.subjectsLearned = subjectsLearned;
		
	}

	public List<String> getSubjectslearned() {
		return subjectslearned;
	}

	public void setSubjectslearned(List<String> subjectslearned) {
		this.subjectslearned = subjectslearned;
	}
			

	public void addSubject(String sublen) {
		System.out.println(subjectslearned.add(sublen));
	}

	
	
}
