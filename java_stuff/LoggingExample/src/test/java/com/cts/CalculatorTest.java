package com.cts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private static Calculator calc;
	
	@BeforeAll
	static void setUp() {
		calc = new Calculator();
	}
	
	@BeforeEach
	void beforeTests() {
		System.out.println("Running before each test case.");
	}
	
	@AfterEach
	void afterTests() {
		System.out.println("Running after each test.");
	}

	@Test
	void testAdd() {
		assertEquals(8, calc.add(5, 3));
	}
	
	@Test
	void testSubtract() {
		assertEquals(2, calc.subtract(5, 3));
	}
	
	@Test
	void testMultiply() {
		assertEquals(15, calc.multiply(5, 3));
	}
	
	@Test
	void testDivide() {
		assertEquals(5, calc.divide(15, 3));
	}
	
	@Test
	void testDivideByZero() {
		assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
	}
	
	@Test
	void testIsEven() {
		assertTrue(calc.isEven(2));
		assertFalse(calc.isEven(3));
	}

}
