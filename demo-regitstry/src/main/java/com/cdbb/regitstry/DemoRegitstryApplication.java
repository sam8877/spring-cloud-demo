package com.cdbb.regitstry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoRegitstryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRegitstryApplication.class, args);
	}

}
