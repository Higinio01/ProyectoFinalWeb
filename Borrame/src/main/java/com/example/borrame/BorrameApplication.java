package com.example.borrame;

import com.example.borrame.Services.BorrameServices;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BorrameApplication {

	public static void main(String[] args) {
		SpringApplication.run(BorrameApplication.class, args);
	}
	@Autowired
	private BorrameServices borranmeServices;

	@PostConstruct
	public void cargarh2() {
		borranmeServices.save(1);
		borranmeServices.save(2);
		borranmeServices.save(3);
		borranmeServices.save(4);
		borranmeServices.save(6);
		borranmeServices.save(7);
		borranmeServices.save(8);
		borranmeServices.save(9);
		borranmeServices.save(10);
		borranmeServices.getAll().forEach(System.out::println);
	}
}
