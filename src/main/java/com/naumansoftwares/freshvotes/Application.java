package com.naumansoftwares.freshvotes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private static Logger logger = LogManager.getLogger(Application.class); 
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		logger.info("Info level log message");
		logger.debug("Debug level log message");
		logger.error("Error level log message");
	}

}
