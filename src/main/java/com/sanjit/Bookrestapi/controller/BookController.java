package com.sanjit.Bookrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanjit.Bookrestapi.binding.Book;
import com.sanjit.Bookrestapi.service.BookService;

@RestController
@CrossOrigin
public class BookController {
	@Autowired
	BookService service;
	@GetMapping("/books")
	public List<Book> getData()
	{
		//added comment to check GIT
		
		return service.getBooksData();
	}
	
	@PostMapping("/post")
	public Book postBooks(@RequestBody Book book)
	{
		return service.postBooksData(book);
		
	}

}
