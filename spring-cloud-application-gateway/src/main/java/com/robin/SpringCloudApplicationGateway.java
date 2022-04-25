package com.robin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudApplicationGateway {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApplicationGateway.class, args);
	}

}
