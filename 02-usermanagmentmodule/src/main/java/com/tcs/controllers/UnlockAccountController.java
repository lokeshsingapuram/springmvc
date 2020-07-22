package com.tcs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tcs.model.UnlockAccount;

@Controller
public class UnlockAccountController {
	
	@GetMapping("/unlockAcc")
	public String loadUnlockAccountForm(@RequestParam("email") String email,Model model) {
		model.addAttribute("email", email);
		UnlockAccount acc=new UnlockAccount();
		model.addAttribute("unlockAcc", acc);
		return "unlockAccForm";

	}

	@PostMapping("/unlockAcc")
	public String handleuUnlockAccBtn(@ModelAttribute("unlockAcc") UnlockAccount unlocakAcc) {
		
		System.out.println(unlocakAcc);
		return "unlockAccForm";
	}
	
}
