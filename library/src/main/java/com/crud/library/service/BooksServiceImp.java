package com.crud.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.library.model.Books;
import com.crud.library.repositary.BooksRepositary;


@Service
public class BooksServiceImp implements BooksService{
	
	@Autowired
	BooksRepositary brepository;

	@Override
	public Books insert(Books b) {
		return brepository.save(b);
	}

	@Override
	public List<Books> show() {
		return brepository.findAll();
	}

	@Override
	public void delete(int id) {
		brepository.deleteById(id);
	}

	@Override
	public Books update(Books b) {
		Books b1 = showById(b.getId()).orElse(null);
		b1.setAuthor(b.getAuthor());
		b1.setCost(b.getCost());
		b1.setTitle(b.getTitle());
		return brepository.save(b1);
	}

	@Override
	public Optional<Books> showById(int id) {
		return brepository.findById(id);
	}
}
