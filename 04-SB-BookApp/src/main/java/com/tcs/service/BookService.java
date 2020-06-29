package com.tcs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tcs.model.Book;
@Service
public interface BookService {
	
	public boolean saveBookDetails(Book book);
	public List<Book> getAllBooks();

}
