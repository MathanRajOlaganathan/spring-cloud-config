package com.config.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/product-client")
public class ProductClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("{product.provider.url}")
	private String url;

	@GetMapping("/get-products")
	public List<String> getProducts() {
		List<String> products =  restTemplate.getForObject(url, List.class);
		return products;
	}
}
