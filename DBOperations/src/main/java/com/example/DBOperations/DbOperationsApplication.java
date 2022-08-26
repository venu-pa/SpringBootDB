package com.example.DBOperations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbOperationsApplication {

	public static void main(String[] args) {
		System.out.println("start");
		SpringApplication.run(DbOperationsApplication.class, args);
		System.out.println("last");
	}

}

