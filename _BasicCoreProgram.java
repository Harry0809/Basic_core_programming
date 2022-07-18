package com.basic.programm;

import java.util.Scanner;

public class _BasicCoreProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th Dividened");
		int number1 = sc.nextInt();
		System.out.println("Enter the Divisor");
		int number2 = sc.nextInt();
		double quotient = (double) number1 / number2;
		System.out.println("Quotient :" + quotient);
		int remainder = number1 % number2;
		System.out.println("Remainder :" + remainder);

	}

}