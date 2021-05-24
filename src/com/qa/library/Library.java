package com.qa.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	public boolean isCheckedIn;
	public boolean isCheckedOut;
	List<Items> itemList;
	List<Person> personList;

	public Library(List<Items> itemList, List<Person> personList) {

		this.isCheckedIn = isCheckedIn;
		this.isCheckedOut = isCheckedOut;
		this.itemList = itemList;
		this.personList = personList;
	}

//Items
	public void addItems(Items lab) {
		itemList.add(lab);
		isCheckedOut = false;
		isCheckedIn = true;
	}

	public void remove(Items lab) {
		itemList.remove(lab);
		isCheckedIn = false;
		isCheckedOut = true;
	}

	public void removeAll() {

		itemList.clear();
		isCheckedIn = false;
		isCheckedOut = true;

	}

//Person	
	public void Register(Person per) {
		personList.add(per);
		isCheckedOut = false;
		isCheckedIn = true;
	}

	public void deletePerson(Person lab) {
		personList.remove(lab);
		isCheckedIn = false;
		isCheckedOut = true;
	}
//	public void UpdatePerson(Person lab) {
//		personList.set(0, lab)
//		isCheckedIn = false;
//		isCheckedOut = true;
//	}

	@Override
	public String toString() {
		return "Library [isCheckedIn=" + isCheckedIn + ", isCheckedOut=" + isCheckedOut + ", itemList=" + itemList
				+ ", personList=" + personList + "]";
	}

}
