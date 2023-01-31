package com.crud.library.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.library.model.Books;
import com.crud.library.service.BooksService;

@RestController
public class BooksController {
	
	@Autowired
	BooksService bservice;
	
	@PostMapping("/create")
	public String insert(@RequestBody Books b) {
		bservice.insert(b);
		return "Add the new book";
	}
	
	@GetMapping("/fetch")
	public List<Books> fetchAll(){
		return bservice.show();
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Books b) {
		bservice.update(b);
		return "The book has been updated";
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		bservice.delete(id);
		return "The book has been sold out";
	}
}