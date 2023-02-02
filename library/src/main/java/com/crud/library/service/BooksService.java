package com.crud.library.service;

import java.util.List;

import com.crud.library.DTO.BookRequest;
import com.crud.library.exception.BookNotFoundException;
import com.crud.library.model.Books;

public interface BooksService {
	public Books insert(BookRequest b);
	
	public Books showById(int id) throws BookNotFoundException;
	
	public List<Books> show() throws BookNotFoundException;
	
	public String delete(int id) throws BookNotFoundException;
	
	public Books update(BookRequest b) throws BookNotFoundException;
}
