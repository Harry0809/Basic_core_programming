package com.basic.programm;

import java.util.Scanner;

public class _BasicCoreProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		_BasicCoreProgram num = new _BasicCoreProgram();
		System.out.println("Enter a number");
		int X = sc.nextInt();
		System.out.println("Enter a number");
		int Y = sc.nextInt();
		System.out.println("Enter a number");
		int Z = sc.nextInt();
		num.maxinum(X, Y, Z);

	}

	public void maxinum(int x, int y, int z) {
		if (x > y && x > z) {
			System.out.println(x + " is a Largest Number");
		} else if (y > x && y > z) {
			System.out.println(y + " is a Largest Number");
		} else {
			System.out.println(z + " is a Largest Number");
		}
	}

}