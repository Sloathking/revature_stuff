package com.day2;

public class TestLooping {
	public static void main(String[] blargs) {
		int i = 0;
		for (i = 1; i <= 5; ++i) {
			System.out.println(i);
		}
		
		int j = 5;
		while (j >= 1) {
			System.out.println(j);
			j--;
		}
		
		int k = -5;
		do {
			System.out.println("k = " + k);
			k--;
		} while (k >= 5);
	}
}
