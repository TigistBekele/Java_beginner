package com.qa.library;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		Book bookA = new Book("Story", "James", 1990);
		Book bookB = new Book("Biology", "C.J Jone", 2010);
		Book bookC = new Book("Maths", "R.F Alen", 2020);

		List<Items> itemList = new ArrayList<>();
		List<Person> personList = new ArrayList<>();
		Library newLib = new Library(itemList, personList);
//	System.out.println(bookA);

		newLib.addItems(bookA);
		newLib.addItems(bookB);
//  newLib.remove(bookB); 
//  newLib.removeAll();

		Magazines megaA = new Magazines("Todays News", "SuperMan", 199);
//    System.out.println(megaA);
		newLib.addItems(megaA);

		Newspapers newsA = new Newspapers("Monday News", "Biruk", 25);
//    System.out.println(newsA);
		newLib.addItems(newsA);

//	person
		Person personA = new Person("Tigist", 30, "Developer");
//	System.out.println(personA);
		newLib.Register(personA);
		personA.setName("Bekele");// to update
//	newLib.deletePerson(personA);
		System.out.println(newLib);

		megaA.Reading();
		bookA.Reading();
		newsA.Reading();
		personA.Reading();

	}
}
