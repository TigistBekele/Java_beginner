package com.qa.conditionals;

public class Fizzbuzz {

	
	public static void fizzbuzz(int num) {

		for (num = 1; num <= 100; num++) {
			if (num % 3 == 0) {
				System.out.println("Fizz");
			} else if (num % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(num);
			}

		}

	}
}
