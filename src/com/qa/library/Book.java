package com.qa.library;

import com.qa.library.Items;

public class Book extends Items {

	private int yearOfPublish;

	public Book(String title, String author, int yearOfPublish) {
		super(title, author);
		this.yearOfPublish = yearOfPublish;

	}

	public int getYearOfPublish() {
		return yearOfPublish;
	}

	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}

	@Override
	public String toString() {
		return "Book [CurrentId=" + id + ", yearOfPublish=" + yearOfPublish + ", TitleOfBook=" + getTitle()
				+ ", Author=" + getAuthor() + "]";
	}

	@Override
	public void Reading() {
		System.out.println("This is Reading Book");

	}

}
