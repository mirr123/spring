package com.mirr.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mirr.demo.test.Book;
import com.mirr.demo.test.BookServices;

@RestController
@RequestMapping("themes")
public class BookController {
	
	@Autowired
	BookServices bookService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Theme Controller";
	}

	@GetMapping("/allbooks")
	public List<Book> getAllBooks() {
		return bookService.getValues();
	}
	
	@PostMapping("/add")
	public List<Book> addBook(@RequestBody Book book){
		return bookService.addBook(book);
	}
	
	@DeleteMapping("/delete")
	public List<Book> deleteBook(@RequestParam Integer id){
		return bookService.removeBook(id);
	}
	
}
