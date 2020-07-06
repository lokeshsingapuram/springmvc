package com.tcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tcs.model.Contact;
import com.tcs.service.ContactService;

@Controller
public class ContactInfoController {
	@Autowired
	private ContactService service;

	@RequestMapping(value = { "/", "/addContact" })
	public String loadContactForm(Model model) {
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		return "contactInfo";
	}

	@PostMapping("/saveContact")
	public String handleSubmitBtn(@ModelAttribute("contact") Contact contact, RedirectAttributes rd, Model model) {

		boolean isSaved = service.saveContact(contact);
		if (isSaved) {
			rd.addFlashAttribute("succMsg", "contact saved Sucessfully");
		} else {
			rd.addFlashAttribute("errMsg", "contact is failed to save");
		}
		return "redirect:/addContact";
	}

	@GetMapping("/viewContactInfo")
	public String handleViewContactsLink(Contact contact, Model model) {

		List<Contact> allContactdetails = service.getAllContacts();
		model.addAttribute("contacts", allContactdetails);
		return "viewContactInfo";
	}
}
