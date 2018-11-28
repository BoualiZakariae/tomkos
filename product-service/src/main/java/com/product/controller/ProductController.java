package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.service.ProductService;
import com.product.to.ProductTO;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService<ProductTO> productService;
	
	@GetMapping("/check/{id}")
	public boolean isProductWithIdExist(@PathVariable Long id) {
		return productService.findById(id).getId() != null;
	}
}
