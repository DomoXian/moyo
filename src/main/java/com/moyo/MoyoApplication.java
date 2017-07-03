package com.moyo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoyoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoyoApplication.class, args);
	}

	@GetMapping("/hello")
	public String testHelloWorld(){
		return "hello world";
	}
}
