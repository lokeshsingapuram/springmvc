package com.tcs.service;

import org.springframework.stereotype.Service;

import com.tcs.Exceptions.NoBookFoundException;

@Service
public class BookServiceImpl implements BookService{

	@Override
	public Double findBookById(String bookId) {
		
		if(bookId.equals("B102")) {
			return 450.00;
		}else {
			throw new NoBookFoundException("BookNotFoundWithGivenId");
			
		}
		
	}

}
