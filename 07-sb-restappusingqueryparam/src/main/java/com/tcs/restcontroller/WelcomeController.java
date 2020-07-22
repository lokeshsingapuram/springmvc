package com.tcs.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping(value = "/welcome")
	public String welcomeMsg(@RequestParam("name") String name) {
		
		return "welcome to spring boot micro services::"+name;
	}
	//passing 2 or more parameters
	@GetMapping(value = "dtls")
	public String getDetails(@RequestParam("name") String name,@RequestParam("course") String course) {
		
		return name+" is enrolled for::"+course;
	}

	//making request attribute is optional
	@GetMapping
	public String getStudentDetails(@RequestParam(name = "id",defaultValue ="101",required = false) String  id) {
		
		return "lokesh is enrolled with id::"+id;
	}
}
