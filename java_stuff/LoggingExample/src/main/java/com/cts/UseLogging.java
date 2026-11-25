package com.cts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UseLogging {

	private static final Logger logger = LoggerFactory.getLogger(UseLogging.class);
	
	public static void main(String[] args) {
		System.out.println("Application started.");
		logger.trace("Trace Message");
		logger.debug("Debug Message");
		logger.warn("Warn Message");
		logger.error("Error Message");
		System.out.println("Application completed.");
	}
}
