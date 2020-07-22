package com.tcs.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping(value = "/welcm/{name}")
	public String welcomMsg(@PathVariable("name")String name) {
		
		return "welcome to RESTfull services::"+name;
	}
	@GetMapping(value = "welcm/{name}/{course}")
	public String getDetails(@PathVariable("name") String name,@PathVariable("course") String course) {
	
		return "Hi "+name+" welcome to::: "+course+"services";
	}
}
