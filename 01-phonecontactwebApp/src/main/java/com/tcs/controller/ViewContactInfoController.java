package com.tcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tcs.model.Contact;
import com.tcs.service.ContactService;

@Controller
public class ViewContactInfoController {
	@Autowired
	private ContactService service;

	@GetMapping("/editContact")
	public String editContact(@RequestParam("contactId") Integer contactId,Model model) {
		
		Contact contact = service.getContactById(contactId);
		model.addAttribute("contact",contact);
		return "contactInfo";
	}
	
	@GetMapping("/deleteContact")
	public String deleteContact(@RequestParam("contactId") Integer contactId,Model model) {
		
		boolean deleteContact = service.deleteContact(contactId);
		if(deleteContact) {
			model.addAttribute("delete","contact deleted sucessfully");

		}else {
			model.addAttribute("delete", "contact is not available");
		}
		return "redirect:/viewContactInfo";

	}

}
