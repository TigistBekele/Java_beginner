package com.qa.classconstructors;

public class Persons {

//	Atributes
	    public String name;
	    public String birthplace;
	    public int Age;
	    public String ethnicity;
	    public String gender;
// Constructor
	    public Persons(String name, String birthplace, int Age, String gender) {
	        this.name = name;
	        this.birthplace = birthplace;
	        this.Age = Age;
	        this.gender = gender;
	    }
	    
//	 Methods
	    
	    public void nameOfp() {
	    	System.out.println(this.name + "the name of employee");
	    }
	    
	    public void placeOfbirth() {
	    	System.out.println(this.name + "is born in :" + this.birthplace);
	    }
	    
//	   Method- overloading
	    public static void speak(boolean isHappy) {
	    	
	    	if(isHappy) {
	    	System.out.println( "yessss I am happy");
	    	}
	    	else {
	    		System.out.println("I am sad");
	    	}
	    }
}
