package com.basic.programm;

import java.util.Scanner;

public class BasicCoreProgram {

	public static void main(String[] args) {
		System.out.println("Welcome To Basic Core program");
		int head_cnt = 0;
		int tail_cnt = 0;
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the no of times to flip a coin:");
		int n = Scan.nextInt();
		for (int i = 1; i < n; i++) {
			double flip = Math.floor(Math.random() * 10) % 2;
			if (flip < 0.5) {
				head_cnt++;
			} else {
				tail_cnt++;
			}

		}
		double headpercentage = (head_cnt * 100) / n;
		double tailpercentage = (tail_cnt * 100) / n;
		System.out.println("The percentage of head flips:" + headpercentage);
		System.out.println("The percentage of tail flips:" + tailpercentage);

	}

}
