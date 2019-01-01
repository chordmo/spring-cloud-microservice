package com.mo.cureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@EnableAutoConfiguration
public class HiController {
	
	@Value("${myinfo.myname}")
	String name;
	
	@GetMapping("hi")
	public String hi() {
		return "hi," + name;
	}
}
