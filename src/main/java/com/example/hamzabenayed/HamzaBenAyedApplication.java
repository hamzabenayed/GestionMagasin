package com.example.hamzabenayed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HamzaBenAyedApplication {

	public static void main(String[] args) {
		SpringApplication.run(HamzaBenAyedApplication.class, args);
	}

}
