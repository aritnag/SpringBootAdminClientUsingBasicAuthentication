package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
@SpringBootApplication
public class ClientServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientServerApplication.class, args);
	}

	@RequestMapping("/")
	public String hello() {
		return "hello";
	}

}
