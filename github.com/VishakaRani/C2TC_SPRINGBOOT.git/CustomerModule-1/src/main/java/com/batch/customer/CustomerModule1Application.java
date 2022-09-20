package com.batch.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerModule1Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomerModule1Application.class, args);
		System.out.println("Your spring is working ");
	}

}
