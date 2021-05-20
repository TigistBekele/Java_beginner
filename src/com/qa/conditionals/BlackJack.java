package com.qa.conditionals;

public class BlackJack {

	public static int blackjack(int numx, int numz) {
			if (numx > 21)
				numx = 0;
			if (numz > 21)
				numz = 0;

			if (numx > numz) {
				return numx;

			} else {
				return numz;
			}

	}	
}
