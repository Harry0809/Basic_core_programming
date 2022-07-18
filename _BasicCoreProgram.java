package com.basic.programm;

public class _BasicCoreProgram {

	public static void main(String[] args) {

		int arr[] = { 0, -1, 2, -3, 1 };
		int n = arr.length;
		findTriplets(arr , n);
	
	class Num {

		void findTriplets(int arr[], int n) {
			boolean check = false;
			for (int i = 0; i < n - 2; i++) {
				for (int j = i + 1; j < n - 1; j++) {
					for (int k = j + 1; k < n; k++) {
						if (arr[i] + arr[j] + arr[k] == 0) {
							System.out.print(arr[i]);
							System.out.print(" ");
							System.out.print(arr[j]);
							System.out.print(" ");
							System.out.print(arr[k]);
							System.out.print("");
							check = true;
						}
					}
				}
			}

			if (check == false)
				System.out.println(" not exist ");

		}
	}
  }
}