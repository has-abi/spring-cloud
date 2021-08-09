package com.zss.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductmsApplication.class, args);
	}

}
