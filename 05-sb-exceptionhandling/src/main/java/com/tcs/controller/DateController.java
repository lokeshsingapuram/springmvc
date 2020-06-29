package com.tcs.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	@RequestMapping("/date")
	public String displayDate(Model model) {
		
		model.addAttribute("date", "today date::"+new Date());
		String msg=null;
		msg.length();
		return "display";
	}

}
