package com.qa.library;

import java.util.List;

public class Person implements Readable {

	private String name;
	private int age;
	private String job;
	public int id;
	public static int count;

	public Person(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.id = ++count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", job=" + job + "]";
	}

	@Override
	public void Reading() {
		System.out.println("This Reading is from Person");

	}

}
