package com.ecf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com")
public class EcommerceFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceFrameworkApplication.class, args);
	}
}
