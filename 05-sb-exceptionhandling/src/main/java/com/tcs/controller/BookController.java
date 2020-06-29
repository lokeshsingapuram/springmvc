package com.tcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tcs.service.BookService;
@Controller
public class BookController {
	@Autowired
	private BookService service;
	@RequestMapping("/book")
	public String getBookPriceById(@RequestParam("bookId") String bookId,Model model) {
		Double price = service.findBookById(bookId);
		model.addAttribute("price", price);
		return "book";
	}

}
