package com.sanjit.Bookrestapi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sanjit.Bookrestapi.binding.Book;

@Service
public class BookService {
	
	public List<Book> getBooksData()
	{
		Book b1 = new Book(101,"core-java",100.00,"ISBN001");
		Book b2 = new Book(102,"adv-java",100.00,"ISBN002");
		Book b3 = new Book(101,"spring_boot",100.00,"ISBN003");
		return Arrays.asList(b1,b2,b3);

	}
	
	public Book postBooksData(Book book)
	{
		return book;
		

	}
	
	

}
