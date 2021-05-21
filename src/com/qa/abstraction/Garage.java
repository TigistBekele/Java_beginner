package com.qa.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	protected List<Vehicle> garageList;
	
	public Garage(List<Vehicle> garageList) {
	    this.garageList = garageList;
	  }
	
	public void addVehcle(Vehicle used) {
	    this.garageList.add(used);
	  }

	  public void removeVehcle(Vehicle rav) {
	    this.garageList.remove(rav);
	  }
	
	  public double calcBill() {
		    // To get Vehicle types.
		    double bill = 0.00;
		    for (int i = 0; i < this.garageList.size(); i++) {
		      if (this.garageList.get(i) instanceof Car) {
		        bill = bill + 15.45;
		      } else {
		        bill = bill + 10;
		      }
		    }
		    return bill;
		  }
	  public void removeByID(int findById) {
		    if (!this.garageList.isEmpty()) {
		      int index = 0;
		      for (int i = 0; i < this.garageList.size(); i++) {
		        if (this.garageList.get(i).id == findById) {
		          index = i;
		        }
		      }
		      this.garageList.remove(index);
		    } else {
		      System.out.println("The garage is empty");
		    }
		  } 
	  
	  public void removeByType(String givenType) {
		    if (!this.garageList.isEmpty()) {
		      List<Vehicle> indexesToRemove = new ArrayList<Vehicle>();
		      for (int i = 0; i < this.garageList.size(); i++) {
		    	  Vehicle XX = this.garageList.get(i);
		        if (givenType == "Car") {
		          if (XX instanceof Car) {
		            indexesToRemove.add(XX);
		          }
		        }
		        
		        if (givenType == "Motecycle") {
		          if (XX instanceof Motercycle) {
		            indexesToRemove.add(XX);
		          }
		        }
		        //remove by types.
		        
		        indexesToRemove.forEach(index -> {
		          System.out.println(index);
		          this.garageList.remove(index);
		        });
		      }
		    } else {
		      System.out.println("no cars");
		    }
		  }

		  public void removeAll() {
		    if (!this.garageList.isEmpty()) {
		      this.garageList.clear();
		    } else {
		      System.out.println("There is no cars");
		    }
		  }

		  public void printList() {
		    if (!this.garageList.isEmpty()) {
		      System.out.println("");
		      System.out.println(this.garageList.iterator().next().toString());
		    } else {
		      System.out.println("There is no cars");
		    }
		  }
		}