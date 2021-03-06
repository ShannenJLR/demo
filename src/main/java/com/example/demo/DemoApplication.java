package com.example.demo;

import com.example.demo.student.student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<student> hello(){
		return List.of(
				new student(
						1l,
						"Ted",
						"Ted.Test@bearmail.com",
						LocalDate.of(2000,05,25),
						21
				)
		);

	}

}
