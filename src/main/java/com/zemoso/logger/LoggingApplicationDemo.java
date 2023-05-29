package com.zemoso.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class LoggingApplicationDemo {

	Logger log = LoggerFactory.getLogger(LoggingApplicationDemo.class);

	@GetMapping("/test/{name}")
	public String greeting(@PathVariable String name) {

		log.debug("Request {}", name);
		if(name.equals("test")) {
			throw new RuntimeException("Exception Raised");
		}
		String response = "Hi " + name + " welcome to Logging Application.";
		log.debug("Response {}", response);
		return response;
	}

	public static void main(String[] args) {

		SpringApplication.run(LoggingApplicationDemo.class, args);
	}

}
