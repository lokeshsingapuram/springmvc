package com.tcs.Exceptions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class AppExceptionHandling {
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Model model) {
		model.addAttribute("errMsg","Sorry for the inconvinence..! please try again later");
		return "error";
		
	}

	@ExceptionHandler(value = NoBookFoundException.class)
	public String handleNoBookFoundException(Model model) {

		model.addAttribute("msg", "No Book Found With Given Id::Please check");
		return "customerr";
	}
}
