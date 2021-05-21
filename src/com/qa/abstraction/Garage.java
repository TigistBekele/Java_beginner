package com.qa.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	protected List<Vehicle> gar_List;
	
	public Garage(List<Vehicle> gar_List) {
	    this.gar_List = gar_List;
	  }
	
	public void addVehcle(Vehicle rav) {
	    this.gar_List.add(rav);
	  }

	  public void removeVehcle(Vehicle rav) {
	    this.gar_List.remove(rav);
	  }
	
	  public double calcBill() {
		    //get Vehicle types.
		    double bill = 0.00;
		    for (int i = 0; i < this.gar_List.size(); i++) {
		      if (this.gar_List.get(i) instanceof Car) {
		        bill = bill + 12.57;
		      } else {
		        bill = bill + 5;
		      }
		    }
		    return bill;
		  }
	  public void removeByID(int Search) {
		    if (!this.gar_List.isEmpty()) {
		      int index = 0;
		      for (int i = 0; i < this.gar_List.size(); i++) {
		        if (this.gar_List.get(i).id == Search) {
		          index = i;
		        }
		      }
		      this.gar_List.remove(index);
		    } else {
		      System.out.println("The garage is empty");
		    }
		  } 
	  
	  public void removeByType(String givenType) {
		    if (!this.gar_List.isEmpty()) {
		      List<Vehicle> indexesToRemove = new ArrayList<Vehicle>();
		      for (int i = 0; i < this.gar_List.size(); i++) {
		    	  Vehicle e = this.gar_List.get(i);
		        if (givenType == "car") {
		          if (e instanceof Car) {
		            indexesToRemove.add(e);
		          }
		        }
		        
		        if (givenType == "motecycle") {
		          if (e instanceof Motercycle) {
		            indexesToRemove.add(e);
		          }
		        }
		        //remove by types.
		        
		        indexesToRemove.forEach(index -> {
		          System.out.println(index);
		          this.gar_List.remove(index);
		        });
		      }
		    } else {
		      System.out.println("no cars");
		    }
		  }

		  public void removeAll() {
		    if (!this.gar_List.isEmpty()) {
		      this.gar_List.clear();
		    } else {
		      System.out.println("no cars");
		    }
		  }

		  public void printList() {
		    if (!this.gar_List.isEmpty()) {
		      System.out.println("");
		      System.out.println(this.gar_List.iterator().next().toString());
		    } else {
		      System.out.println("no cars");
		    }
		  }
		}