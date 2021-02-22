package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.CinemaRepository;

@SpringBootApplication
public class SpringCarteleraCineApplication {
	@Autowired
	private CinemaRepository cinemaRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringCarteleraCineApplication.class, args);
	}
	public void run(String... args) throws Exception {

		
		// Crear datos
	}
}
