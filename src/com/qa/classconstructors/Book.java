package com.qa.classconstructors;

import java.sql.Date;

public class Book {

//	attribute
	public String title;
	public String author;
	public int edition;
	public Date dateOfPublish;
	public boolean isInteresting;

//	constructor
	public Book(String title, String author, int edition) {
		this.title = title;
		this.author = author;
		this.edition = edition;

	}

//   Method
	public void buy() {
		System.out.println(this.title + " this book is written by ");
	}

	public boolean isStillInteresting() {
		return isInteresting;
	}

	public String reading(String msg) {
		return this.title + " have : " + msg;
	}

	public int howmanytimesedited() {
		return edition;
	}

}
