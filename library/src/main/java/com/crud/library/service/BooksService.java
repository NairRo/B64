package com.crud.library.service;

import java.util.List;
import java.util.Optional;

import com.crud.library.model.Books;

public interface BooksService {
	public Books insert(Books b);
	
	public Optional<Books> showById(int id);
	
	public List<Books> show();
	
	public void delete(int id);
	
	public Books update(Books b);
}
