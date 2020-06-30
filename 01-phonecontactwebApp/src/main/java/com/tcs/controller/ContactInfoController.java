package com.tcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tcs.model.Contact;

@Controller
public class ContactInfoController {
	@RequestMapping("/")
	public String loadContactForm(Model model) {
		return "contactInfo";
	}
	@PostMapping("/contact")
	public String handleSubmitBtn(@ModelAttribute("contact") Contact contact,Model model) {
		
		return "contactInfo";
	}

	@GetMapping("/viewContactsInfo")
	public String handleViewContactsLink(Model model) {
		
		return "viewContactsInfo";
	}
}
