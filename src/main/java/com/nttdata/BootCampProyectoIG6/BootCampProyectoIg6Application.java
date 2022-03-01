package com.nttdata.BootCampProyectoIG6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class BootCampProyectoIg6Application implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(BootCampProyectoIg6Application.class, args);
	}
	private static final Logger logger = LogManager.getLogger(BootCampProyectoIg6Application.class);
	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.debug("Debug de la aplicación");
		logger.info("Info Log");
		logger.warn("Warning");
		logger.error("Error");
		logger.fatal("Fatal Error");
	}
}
