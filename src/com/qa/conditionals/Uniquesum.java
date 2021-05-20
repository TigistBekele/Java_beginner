package com.qa.conditionals;

public class Uniquesum {
	public static int uniquesum(int r, int s, int t) {

		int sum = r + s + t;

		if (r == s && s == t) {
			return 0;
		}

		else if (r == s) {
			return t;
		} else if (s == t) {
			return r;
		} else if (r == t) {
			return s;

		} else {
			return sum;
		}

	}
}
