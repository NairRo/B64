package com.crud.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.library.DTO.BookRequest;
import com.crud.library.exception.BookNotFoundException;
import com.crud.library.model.Books;
import com.crud.library.service.BooksService;

import jakarta.validation.Valid;

@RestController
public class BooksController {
	
	@Autowired
	BooksService bservice;
	
	@PostMapping("/create")
	public ResponseEntity<Books> insert(@RequestBody @Valid BookRequest b) {
		return new ResponseEntity<>(bservice.insert(b), HttpStatus.CREATED);
	}
	
	@GetMapping("/fetch")
	public ResponseEntity<List<Books>> fetchAll() throws BookNotFoundException{
		return new ResponseEntity<>(bservice.show(), HttpStatus.CREATED);
	}
	
	@GetMapping("/fetch/{id}")
	public ResponseEntity<Books> fetchById(@PathVariable Integer id) throws BookNotFoundException{
		return new ResponseEntity<>(bservice.showById(id), HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Books> update(@RequestBody @Valid BookRequest b) throws BookNotFoundException {
		return new ResponseEntity<>(bservice.update(b), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) throws BookNotFoundException {
		return new ResponseEntity<>(bservice.delete(id), HttpStatus.CREATED);
	}
	
	
}