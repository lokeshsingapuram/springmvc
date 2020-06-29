package com.tcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tcs.model.Book;
import com.tcs.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService service;
	@GetMapping(value= {"/","book"})
	public String loadAddBookForm(Model model) {
		
		Book book=new Book();
		model.addAttribute("book",book);
		return "loadForm";
	}
	@PostMapping("/register")
public String handleAddBookBtn(@ModelAttribute("book") Book book,Model model) {
	
	boolean isSaved = service.saveBookDetails(book);
	String msg="";
	if(isSaved) {
		msg="Book Saved SucessFully";
	}
	else{
		msg="BooK failed to save the Details";
	}
	model.addAttribute("msg",msg);
	return "loadForm";
}
	@GetMapping("/getDetails")
	public String getAllBooksDetails(Book books,Model model) {
		List<Book> allBooks = service.getAllBooks();
		model.addAttribute("books",allBooks);
		return "viewBooks";
	}
}
