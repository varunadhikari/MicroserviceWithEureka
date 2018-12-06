package com.microservice2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceTwoController {
	
	@Autowired
	Environment environment;
	
	public String test(){
		String port = environment.getProperty("local.server.port");
		return "Microservice 1 running in :" + port; 
	}

}
