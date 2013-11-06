package com.vispractice.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 * 
 */
public class App {
	//private static final Logger logger = LogManager.getLogger(App.class);
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void doIt() {
		logger.error("Did it again!");
	}

	public static void main(String[] args) {
		App.doIt();
		logger.trace("Exiting application."); 
	}
}
