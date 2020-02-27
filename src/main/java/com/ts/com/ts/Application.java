package com.ts.com.ts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("Hello from Bhogade");
		SpringApplication.run(Application.class, args);
		System.out.println("one change");
	}

}
