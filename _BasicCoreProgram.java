package com.basic.programm;

import java.util.Scanner;

public class _BasicCoreProgram {
	public static void main(String[] args) {

		double result = 0, num = 0, i;
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the harmonic you want to find: ");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			num = num + (1 / i);
			result = num;
		}
		System.out.println("the value of harmonic no. " + n + " is: " + result);

	}
}