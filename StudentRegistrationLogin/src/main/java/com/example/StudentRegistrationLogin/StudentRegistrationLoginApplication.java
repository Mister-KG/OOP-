package com.example.StudentRegistrationLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class StudentRegistrationLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRegistrationLoginApplication.class, args);
	}

}
