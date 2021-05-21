package com.qa;

import java.util.ArrayList;
import java.util.List;

import com.qa.abstraction.Bike;
import com.qa.abstraction.Car;
import com.qa.abstraction.Garage;
import com.qa.abstraction.Motercycle;
import com.qa.abstraction.Vehicle;
import com.qa.array.Array;
import com.qa.arraylist.ArraylistExa;
import com.qa.classconstructors.Book;
import com.qa.classconstructors.Persons;
import com.qa.conditionals.BlackJack;
import com.qa.conditionals.Fizzbuzz;
import com.qa.conditionals.Flowcharts;
import com.qa.conditionals.Result;
import com.qa.conditionals.Taxes;
import com.qa.conditionals.Uniquesum;
import com.qa.encapsulation.Cat;
import com.qa.helloworld.HelloWorld;
import com.qa.inheritance.Employee;
import com.qa.inheritance.Person;
import com.qa.inheritance.Trainee;
import com.qa.iteration.Iterations;
import com.qa.operators.Calculator;
import com.qa.stringmanipulation.Stringmanipulation;

public class Runner {

	public static void main(String[] args) {

//	    *************Calculator***************

		Calculator.division(10.5d, 2.5d);
		Calculator.Flowcharts(5, 7, true);
		Calculator.Flowcharts(5, 7, false);

		System.out.println(Calculator.subtraction(10, 5));
		System.out.println(Calculator.multiplication(10, 5));
		System.out.println(Calculator.add(10, 5));

//		*************HelloWorld*************

		HelloWorld.helloMain();

//		**************Result****************

		Result.displayResults();
		Result.displayExamOverall();
		Result.displayPassMark();
		Result.displayOverallPassMark();

//		***********Flowcharts****************

		Flowcharts.Flowchart(5, 7, true);
		Flowcharts.Flowchart(5, 7, false);

//		***************BlackJack******************

		System.out.println(BlackJack.blackjack(10, 21));
		System.out.println(BlackJack.blackjack(20, 18));
		System.out.println(BlackJack.blackjack(1, 22));
		System.out.println(BlackJack.blackjack(22, 23));

//		*****************Uniquesum*****************
		
		System.out.println(Uniquesum.uniquesum(1, 2, 3));
		System.out.println(Uniquesum.uniquesum(3, 3, 3));
		System.out.println(Uniquesum.uniquesum(1, 1, 2));
		System.out.println(Uniquesum.uniquesum(3, 2, 2));
		System.out.println(Uniquesum.uniquesum(3, 6, 3));

//		********Taxes*****************

		Taxes.taxescalc();

//		******Iteration****************

		Iterations.iterationExe();

//		*********Array*****************

		Array.arrayTest();

		Array.arraystring();

		Array.method();

//		*****************ArryList**************

		ArraylistExa.allarray();

//	    **********StringManipulation**************

		Stringmanipulation.stringMan();

//		********FizzBuzz**********

		Fizzbuzz.fizzbuzz(100);
		
//		************encapsulation**************
		
//		Cat newCat = new Cat("pop", 2, "black and white");
//		
//		System.out.println(Cat.getNameOfCat("pop"));

//		*****************************BOOK*******************************

		Book jone = new Book("What Insects Do", "Jone", 5);
		Book bookVar = new Book("flower", "James", 6, true);
		System.out.println(jone.title);
		System.out.println(jone.author);
		System.out.println(jone.edition);
		System.out.println(jone.reading("read this book"));

		System.out.println(bookVar.isInteresting);

//     ****************Person**********************

		Persons tg = new Persons("Tigist", "Eth", 30, "Female");

		System.out.println(tg.name);
		System.out.println(tg.gender);
		System.out.println(tg.Age);

		Persons.speak(false);
		Persons.speak(true);
		
		
//		*************inheritance**************
//		
		Person examplePerson = new Person("Tigist", 25 , "st.paul", true, "brown");
	
		examplePerson.livingPlace();
		examplePerson.eye();
		
	    Employee exampleEmployee1 = new Employee("Hanna", 23 ,51000.23);
	    Employee exampleEmployee2 = new Employee("Beza", 26 ,53000.21);
	    Employee exampleEmployee3 = new Employee("Tsion", 29 ,58000.25);
		
	    System.out.println(exampleEmployee1.calculateWeeklySalary());
	    System.out.println(exampleEmployee2.calculateWeeklySalary());
	    System.out.println(exampleEmployee3.calculateWeeklySalary());
	    
	    System.out.println(exampleEmployee1.getName());
	    System.out.println(exampleEmployee2.getName());
	    System.out.println(exampleEmployee3.getName());
		exampleEmployee1.speak();
		
		System.out.println("The name of person is : " + examplePerson.getName());
		System.out.println("The name of person is : " + exampleEmployee1.getName());
		
		Trainee exampleTrainee = new Trainee("Bob", 24, "Stpaul");
		
		
		exampleTrainee.addSubject("Music");
		exampleTrainee.addSubject("Maths");
		exampleTrainee.addSubject("Engilish");
		
		System.out.println(exampleTrainee.getSubjectslearned());
		
		
		
//	System.out.println("this is my" + Person.getEmployee());
		
//*************Garage************		
		
		Car BW = new Car(23,"BMW", 10000, "Red", 2010, 4);
	    Motercycle running = new Motercycle (24, "BOBO", 0, "Gray", 2018);
	    Bike lili = new Bike(25,"GOGO",2344, "white", 2000, true);
	    List<Vehicle> downtown = new ArrayList<Vehicle>();
	    Garage GarageXX = new Garage(downtown);
	    
	    //adds two vehicals
	    GarageXX.addVehcle(BW);
	    GarageXX.addVehcle(lili);
	    
	    //calculate The bill
	    
	    double bill = GarageXX.calcBill();
	    System.out.println("The Bill is: " + "$" + bill);
	    //print what we have in the garage
	    GarageXX.printList();
	    //remove by object.
	    GarageXX.removeByID(2);
	    GarageXX.printList();

	    // To remove by Id.
	    GarageXX.removeByID(2);
	    GarageXX.printList();
	    
	    //add the Bike and then remove all.
	    GarageXX.addVehcle(running);
	    GarageXX.printList();
	    GarageXX.removeAll();
	    GarageXX.printList();

	    //remove by type
	    GarageXX.addVehcle(running);
	    GarageXX.printList();
	    GarageXX.removeByType("Motercycle");
	    GarageXX.printList();

//	*********abstraction"********************
	Car lemo  = new Car(0, "Toyota", 1000, "Gray", 4, 0);
	
	System.out.println(lemo.getBrand());
	System.out.println(lemo.getColor());
	System.out.println(lemo.getWheel());

	lemo.fast();
	lemo.ride();
	lemo.stop();
		
	
	
	
	Motercycle motoNice = new Motercycle(33,"new",0, "Black", 2020);
	
	System.out.println(motoNice.getBrand());
	System.out.println(motoNice.getColor());


	motoNice.fast();
	motoNice.ride();
	motoNice.stop();

	
	Bike oldBike = new Bike(23,"HOHO", 299,"red", 2012,false);
	
	System.out.println(oldBike.getBrand());
	System.out.println(oldBike.getColor());
	System.out.println(oldBike.getWorkyr());
	
	
	oldBike.fast();
	oldBike.stop();
	oldBike.ride();
	
	}


	

	
}
