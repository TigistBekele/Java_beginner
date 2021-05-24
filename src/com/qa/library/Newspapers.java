package com.qa.library;

public class Newspapers extends Items {

	private int pageNumber;

	public Newspapers(String title, String author, int pageNumber) {
		super(title, author);
		this.pageNumber = pageNumber;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	@Override
	public void Reading() {

		System.out.println("This is Reading Newspaper");
	}

	@Override
	public String toString() {
		return "Newspapers [CurrentId=" + id + ",pageNumber=" + pageNumber + ", getPageNumber=" + getPageNumber()
				+ ", getTitle=" + getTitle() + ", getAuthor=" + getAuthor() + "]";
	}

}
