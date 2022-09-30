package com.mylearning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	private static final Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	public static void main(String[] args) {
		logger.info("Spring Main Application");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

	public Integer add(Integer num1,Integer num2) {
		return num1+num2;
	}
	
	public Integer multiply(Integer num1,Integer num2) {
		return num1*num2;
	}
	
	public Integer substract(Integer num1,Integer num2) {
		if(num1>num2) return num1-num2;
		else return num2-num1;
	}
}
