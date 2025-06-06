package com.dailybread.serviceregistery.serviceregistery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceregisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceregisteryApplication.class, args);
	}

}
// try
