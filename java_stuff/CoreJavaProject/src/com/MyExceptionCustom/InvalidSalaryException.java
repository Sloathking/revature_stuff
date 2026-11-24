package com.MyExceptionCustom;

public class InvalidSalaryException extends Exception {

	private static final long serialVersionUID = 5673503092841167259L;

	public InvalidSalaryException(String message) {
		super(message);
	}

}
