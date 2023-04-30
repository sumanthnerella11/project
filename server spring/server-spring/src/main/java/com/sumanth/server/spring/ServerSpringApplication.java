package com.sumanth.server.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sumanth.server.spring" )
@EnableAutoConfiguration
public class ServerSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerSpringApplication.class, args);
	}

}
