package com.tcs.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		String msg="Hi ,How are you doing::";
		return msg;
	}

}
