package com.learning.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.learning.shared.Product;

@FeignClient(value = "product-service", url = "http://localhost:9090/product")
public interface ProductClient {

	@GetMapping("/{id}")
	 Product getProduct(@PathVariable Long id);
	
	/*
	 * @GetMapping("/{id}")
	public ProductEntity findById(@PathVariable Long id)
	 * 
	 */
}
