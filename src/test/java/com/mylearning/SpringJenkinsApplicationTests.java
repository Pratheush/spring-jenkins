package com.mylearning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	private static final Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	SpringJenkinsApplication app=new SpringJenkinsApplication();
	
	@Test
	void addTest() {
		logger.info("Spring Test ApplicationTests Addition");
		assertEquals(4, app.add(2, 2));
	}
	
	@Test
	void multiplyTest() {
		logger.info("Spring Test ApplicationTests Multiply");
		assertEquals(6, app.multiply(3, 2));
	}

	@Test
	void substractTest() {
		logger.info("Spring Test ApplicationTests Substract");
		assertEquals(1, app.substract(3, 2));
	}
}
