package com.pn;

public class PalindromeChecker {

	public void Checker(int n) {
		int temp;
		int r;
		int sum = 0;

		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}

		if (temp == sum) {
			System.out.println(sum + " is a palindrome");
		} else {
			System.out.println(sum + " is not a palindrome");

		}
	}
}
