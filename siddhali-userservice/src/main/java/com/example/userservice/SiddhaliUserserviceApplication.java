package com.example.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SiddhaliUserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiddhaliUserserviceApplication.class, args);
	}

}
