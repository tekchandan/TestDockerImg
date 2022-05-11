package com.tc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping("/hello")
public class HelloController {
	
//	@GetMapping("/")
//	public String index() {
//		return "Welcome to the world!";
//	}

    @GetMapping("/hello")
	public String getName() {
		return "Hello Awengers, Good afternoon";
	}
}
