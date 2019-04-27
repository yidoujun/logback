package com.ypc.logtest.logback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class LogbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogbackApplication.class, args);
	}

}
