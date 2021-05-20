package com.qa;

import java.util.ArrayList;

import com.qa.abstraction.Bike;
import com.qa.abstraction.Car;
import com.qa.abstraction.Motercycle;
import com.qa.array.Array;
import com.qa.arraylist.ArraylistExa;
import com.qa.classconstructors.Book;
import com.qa.classconstructors.Person;
import com.qa.conditionals.BlackJack;
import com.qa.conditionals.Fizzbuzz;
import com.qa.conditionals.Flowcharts;
import com.qa.conditionals.Result;
import com.qa.conditionals.Taxes;
import com.qa.conditionals.Uniquesum;
import com.qa.helloworld.HelloWorld;
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

//		*****************************BOOK*******************************

		Book jone = new Book("What Insects Do", "Jone", 5);
		Book bookVar = new Book("flower", "James", 6);
		System.out.println(jone.title);
		System.out.println(jone.author);
		System.out.println(jone.edition);
		System.out.println(jone.reading("read this book"));

		System.out.println(bookVar.title);

//     ****************Person**********************

		Person tg = new Person("Tigist", "Eth", 30, "Female");

		System.out.println(tg.name);
		System.out.println(tg.gender);
		System.out.println(tg.Age);

		Person.speak(false);

		
		
//		*************inheritance**************
//		
//		Person jone = new Person("jone", "MN", 23, "new");
//	
//	    Person james = new Person("james","ST" , 35, "old");
		
//	System.out.println("this is my" + Person.getEmployee());
		
		
//	*********abstraction"********************
	Car lemo  = new Car("Toyota", 1000, "Gray", 4);
	
	System.out.println(lemo.getBrand());
	System.out.println(lemo.getColor());
	System.out.println(lemo.getWheel());

	lemo.fast();
	lemo.ride();
	lemo.stop();
		
	
	
	
	Motercycle motoNice = new Motercycle("new", 35, "Black","metal");
	
	System.out.println(motoNice.getBrand());
	System.out.println(motoNice.getColor());
	System.out.println(motoNice.getMadeOf());

	motoNice.fast();
	motoNice.ride();
	motoNice.stop();

	
	Bike oldBike = new Bike("old", 299,"red", 4);
	
	System.out.println(oldBike.getBrand());
	System.out.println(oldBike.getColor());
	System.out.println(oldBike.getWorkyr());
	
	
	oldBike.fast();
	oldBike.stop();
	oldBike.ride();
	}
	

	
}
