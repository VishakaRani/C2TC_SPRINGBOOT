package com.batch.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerModuleApplication.class, args);
		System.out.println("YES THE spring is working ");
	}

}
