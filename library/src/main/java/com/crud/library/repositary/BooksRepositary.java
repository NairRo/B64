package com.crud.library.repositary;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.library.model.Books;

public interface BooksRepositary extends JpaRepository<Books, Integer>{
}
