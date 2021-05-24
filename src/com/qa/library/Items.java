package com.qa.library;

public abstract class Items implements Readable {

	private String title;
	private String author;
	public int id;
	public static int counter = 0;

	public Items(String title, String author) {
		super();
		this.title = title;
		this.author = author;
		this.id = ++counter;

	}

	public Items() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Items.counter = counter;
	}

	public void reading() {
		System.out.println();
	}

}
