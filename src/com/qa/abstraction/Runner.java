package com.qa.abstraction;

import java.util.ArrayList;
import java.util.List;



public class Runner {

	public static void main(String[] args) {
		
		Car carA = new Car("BwW", 10000, "Black");
		Car carB = new Car("Toyota", 20000, "Red");
		Car carC = new Car("Acura", 4000, "Gray");
		
		Bike bikeA = new Bike("Abc", 2300, "Yellow", false);
		Bike bikeB = new Bike("EFG", 2400, "Black", true);
		Bike bikeC = new Bike("HIJ", 2109, "Pink", true);
		
		Motercycle moterA = new Motercycle("RRR", 2388, "Red", false);
		Motercycle moterB = new Motercycle("GGG", 10993, "Red", true);
		Motercycle moterC = new Motercycle("HHH", 289944, "Red", false);
		
		List<Vehicle> garageList = new ArrayList<>();
		
		Garage newgar = new Garage(garageList);
		
		newgar.addVehicle(carA);
		newgar.addVehicle(carB);
		newgar.addVehicle(carC);
		
		
		newgar.addVehicle(bikeA);
		newgar.addVehicle(bikeB);
		newgar.addVehicle(bikeC);
		
		newgar.addVehicle(moterA);
		newgar.addVehicle(moterB);
		newgar.addVehicle(moterC);
		
//		newgar.removeAllVehicle();
//		newgar.removeByID(2);
//	    newgar.removeVehicle(moterC);
		System.out.println("The Total Bill is: " + newgar.calcBill());
		System.out.println(newgar);
		 
		carA.isDrivingfast();
		bikeA.isDrivingfast();
		moterA.isDrivingfast();
		
		
	}
	
}
