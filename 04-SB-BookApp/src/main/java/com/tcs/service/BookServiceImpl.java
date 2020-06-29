package com.tcs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.entities.BookEntity;
import com.tcs.entities.BookEntityRepo;
import com.tcs.model.Book;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookEntityRepo bookEntityRepo;

	@Override
	public boolean saveBookDetails(Book book) {
		
		BookEntity entity=new BookEntity();
		BeanUtils.copyProperties(book, entity);
		BookEntity saveBook = bookEntityRepo.save(entity);
		return saveBook.getBookId()!=null;
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> books=new ArrayList<Book>();
		List<BookEntity> booksList= bookEntityRepo.findAll();
		booksList.forEach(entity->{
			Book book=new Book();
			//BeanUtils.copyProperties(entity, b);
			book.setBookId(entity.getBookId());
			book.setBookName(entity.getBookName());
			book.setAuthour(entity.getAuthour());
			book.setPrice(entity.getPrice());
			books.add(book);
		});
		return books;
	}

}
