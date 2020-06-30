package com.tcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tcs.model.Contact;

@Controller
public class ViewContactInfoController {

	@GetMapping("/editContact")
	public String editContact(@RequestParam("contactId") Contact contact,Model model) {
		return "contactInfo";
	}
	@PostMapping("/updateContact")
	public String updateContactInfo(Contact c,Model model) {
		
		return "viewContactInfo";
	}
	@GetMapping("/deleteContact")
	public String deleteContact(@RequestParam("contactId") Contact contact) {
		
		return "viewContactInfo";
	}
}
