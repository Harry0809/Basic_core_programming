package com.basic.programm;

import java.util.Scanner;

public class _BasicCoreProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int Number = sc.nextInt();
		if (Number % 2 == 0) {
			System.out.println(Number + " " + "is an Even Number");
		} else
			System.out.println(Number + " " + "is an Even Number");

	}
}