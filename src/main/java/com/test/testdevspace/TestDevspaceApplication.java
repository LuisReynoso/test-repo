package com.test.testdevspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class TestDevspaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestDevspaceApplication.class, args);
	}
}
