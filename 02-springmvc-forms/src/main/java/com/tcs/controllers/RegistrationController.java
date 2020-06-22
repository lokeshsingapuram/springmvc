package com.tcs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tcs.model.Registration;

@Controller
public class RegistrationController {
	@GetMapping(value = {"/","/register"})
	public String registration() {
		return "register";
		
	}
	
	  @PostMapping("/register") 
	  public String registerSucessBtn(Registration regi,Model model) {
		  String msgTxt="User Registered Sucessfully";
			model.addAttribute("msg", msgTxt);
	  return "registrationSucess"; 
	  }
	 
}
