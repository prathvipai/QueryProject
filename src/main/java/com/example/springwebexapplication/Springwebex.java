package com.example.springwebexapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Springwebex extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Springwebex.class);
	}

	
	public static void main(String[] args) {
		System.out.println("SpringBoot Application ");
		SpringApplication.run(Springwebex.class, args);
		System.out.println("SpringBoot Application ");
	}

}
