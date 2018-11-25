package com.address.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
}
