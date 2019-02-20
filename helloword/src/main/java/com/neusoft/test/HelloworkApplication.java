package com.neusoft.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//测试冲突
@SpringBootApplication
@RestController
public class HelloworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworkApplication.class, args);
	}
	
	//123
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}

}
