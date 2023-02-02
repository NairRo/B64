package com.crud.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.library.DTO.BookRequest;
import com.crud.library.exception.BookNotFoundException;
import com.crud.library.model.Books;
import com.crud.library.repositary.BooksRepositary;


@Service
public class BooksServiceImp implements BooksService{
	
	@Autowired
	BooksRepositary brepository;

	@Override
	public Books insert(BookRequest b) {
		Books b1 = Books.build(b.getId(), b.getAuthor(), b.getTitle(), b.getCost());
		return brepository.save(b1);
	}

	@Override
	public List<Books> show() throws BookNotFoundException {
		List<Books> l = brepository.findAll();
		if(l.isEmpty()) {
			throw new BookNotFoundException("There are no books");
		}
		else {
			return l;
		}
		
	}

	@Override
	public String delete(int id) throws BookNotFoundException {
		showById(id);
		brepository.deleteById(id);
		return "The book has been deleted";
	}

	@Override
	public Books update(BookRequest b) throws BookNotFoundException {
		Books b1 = showById(b.getId());
		b1.setAuthor(b.getAuthor());
		b1.setCost(b.getCost());
		b1.setTitle(b.getTitle());
		return brepository.save(b1);
	}

	@Override
	public Books showById(int id) throws BookNotFoundException {
		Books b = brepository.findById(id).orElse(null);
		if (b == null) {
			 throw new BookNotFoundException("The book does not exist " + id);
		 }
		 else {
			 return b;
		 }
	}
}
