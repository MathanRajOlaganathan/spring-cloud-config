package com.config.product.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-service/")
public class ProductController {
	
	@GetMapping("/getProducts")
	public List<String> getProducts() {
		
		return Stream.of("Apple","Samsung","OnePlus").collect(Collectors.toList());
		
	}

}
