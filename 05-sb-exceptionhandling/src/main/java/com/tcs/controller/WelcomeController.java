package com.tcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	public String welcomeMessage(Model model) {
		String txtMsg="Welcome to Corona world";
		String msg=null;
		msg.length();
		model.addAttribute("msg",txtMsg);
		return "welcome";
	}
	

}
