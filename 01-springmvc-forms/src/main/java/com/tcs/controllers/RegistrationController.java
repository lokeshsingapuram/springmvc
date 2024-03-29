package com.tcs.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
	@GetMapping(value = {"/","/register"})
	public String registration(HttpServletRequest req,Model model) {
		
		
		return "register";
		
	}
	
	  @PostMapping("/register") 
	  public String registerSucessBtn(HttpServletRequest req,Model model) {
		  String name = req.getParameter("uname");
			System.out.println("User Name:"+name);
			String Password = req.getParameter("pwd");
			System.out.println("Password:"+Password);
			String email = req.getParameter("email");
			System.out.println("Email-id:"+email);
			String PhoneNumber= req.getParameter("phno");
			System.out.println("Phone Number:"+PhoneNumber);
			String msgTxt="User Registered Sucessfully";
			model.addAttribute("msg", msgTxt);
	  return "registrationSucess"; 
	  }
	 
}
