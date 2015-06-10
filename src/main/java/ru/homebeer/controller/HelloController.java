package ru.homebeer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cont")
public class HelloController {
	@RequestMapping ("/hello")
	public String hello() {
		return "Welcome!";
	}
	
	@RequestMapping("/goodbye")
	public String bye() {
		return "GoodBye!";
	}
}
