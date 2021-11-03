package com.sky.cardealership;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class CardealershipApplication {

	public static void main(String[] args) {

		SpringApplication.run(CardealershipApplication.class, args);
		System.out.println("Test");
	}

}
