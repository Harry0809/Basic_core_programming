package com.basic.programm;

import java.util.Scanner;

public class _BasicCoreProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the point x");
		int x = sc.nextInt();
		System.out.println("Enter the point y");
		int y = sc.nextInt();
		Double distance = (Double) Math.sqrt(Math.pow(x, 2) + Math.pow(x, 2));
		System.out.println("Euclidean distance from the point (x, y) to the origin (0, 0) :" + distance);
	}

}