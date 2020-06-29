package com.tcs.service;

import org.springframework.stereotype.Service;

@Service
public interface BookService {
	
	public Double findBookById(String bookId);

}
