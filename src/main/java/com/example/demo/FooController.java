package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {
	@GetMapping("bar")
	public String bar() {
		return "BAR";
	}
}
