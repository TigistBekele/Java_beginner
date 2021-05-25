package com.qa.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	protected List<Vehicle> garageList;

	public Garage(List<Vehicle> garageList) {
		this.garageList = garageList;
	}

	public void addVehicle(Vehicle used) {
		garageList.add(used);
	}

	public void removeVehicle(Vehicle used) {
		garageList.remove(used);
	}

	public void removeAllVehicle() {
		garageList.clear();
	}

	public double calcBill() {
		double bill = 0.00;
		for (int i = 0; i < this.garageList.size(); i++) {
			if (this.garageList.get(i) instanceof Car) {
				bill = bill + 50.50;
			} else if (this.garageList.get(i) instanceof Bike) {
				bill = bill + 20.33;
			} else if (this.garageList.get(i) instanceof Motercycle) {
				bill = bill + 25.98;
			} else {
				bill = bill + 0.00;
			}
		}
		return bill;
	}

	public void removeByID(int currentid) {
		garageList.remove(currentid);
		
	}

	@Override
	public String toString() {
		return "Garage [garageList=" + garageList + ", calcBill()=" + calcBill()
				+ "]";
	}


	
	
}