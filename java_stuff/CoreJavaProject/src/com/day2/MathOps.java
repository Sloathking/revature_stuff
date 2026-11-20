package com.day2;

public class MathOps {

	public static void main(String[] args) {
		int a = 7, b = 2;
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println(a / (double)b);
		
		int i = 5;
		int x = i++;
		int y = ++i;
		
		System.out.println(i + " " + x + " " + y);
		
		System.out.println(Math.pow(2, 10));
		System.out.println(Math.sqrt(144));
		System.out.println(Math.abs(-9));
		System.out.println(Math.max(3,  8));
		System.out.println(Math.round(2.5));
		System.out.println(Math.floor(2.5));
		System.out.println(Math.random());
		System.out.println( (int)(Math.random() * 6) + 1);
		
		System.out.println(1 + 2 + "3");
		System.out.println("1" + 2 + 3);
	}

}
