package com.qa.library;

public class Magazines extends Items {

	public int price;

	public Magazines() {
		super();

	}

	public Magazines(String title, String author, int price) {
		super(title, author);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Magazines [CurrentId=" + id + ",price=" + price + ", getPrice=" + getPrice()
				+ ", getTitle=" + getTitle() + ", getAuthor=" + getAuthor() + "]";
	}

	@Override
	public void Reading() {
		System.out.println("This is Reading Megazines.");

	}

}
