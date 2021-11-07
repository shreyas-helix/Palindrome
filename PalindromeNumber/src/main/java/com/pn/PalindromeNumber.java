package com.pn;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n");
		int n = scan.nextInt();
		scan.close();

		PalindromeChecker pc = new PalindromeChecker();
		pc.Checker(n);
	}

}
