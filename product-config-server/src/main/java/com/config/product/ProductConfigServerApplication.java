package com.config.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ProductConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductConfigServerApplication.class, args);
	}

}
