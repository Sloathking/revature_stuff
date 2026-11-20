package com.day2;

public class TestArrays {
	@SuppressWarnings("unused")
	public static void main(String[] blargs) {
		int[] numbers = {1,2,3,4,5};
		
		/*
		 * for (int num : numbers) { System.out.println(num); }
		 * 
		 * for (int i = 0; i < numbers.length; i++) { System.out.println(numbers[i]); }
		 */
		
		int[][] matrix = {{1,2,3}, {4,5,6}};
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		int[][] matrix2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				if (matrix2[i][j] % 2 == 0) evenCount++;
				else oddCount++;
				if (i == j) System.out.println(matrix2[i][j]);
			}
		}
		
		System.out.println("Number of even: " + evenCount);
		System.out.println("Number of odd: " + oddCount);
	}
}
