package com.google.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemospringApplication {

	public static void main(String[] args) {
		System.out.println("demo project");
		SpringApplication.run(DemospringApplication.class, args);
		
		System.out.println("demo project statement started ");
	}

}
