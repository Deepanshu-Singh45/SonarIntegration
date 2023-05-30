package com.zemoso.logger;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoggingApplicationDemoApplicationTests {

	@Test
	void contextLoads() {
		// Add an assertion
		int expectedValue = 5;
		int actualValue = 2 + 3;
		Assertions.assertEquals(expectedValue, actualValue, "The sum should be 5.");
	}

}
