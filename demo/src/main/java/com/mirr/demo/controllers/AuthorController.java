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

import com.mirr.demo.test.Author;
import com.mirr.demo.test.AuthorServices;
import com.mirr.demo.test.Theme;

@RestController
@RequestMapping("authors")
public class AuthorController {
	
	@Autowired
	AuthorServices authorService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Theme Controller";
	}
	
	@GetMapping("/allauthors")
	public List<Author> getAllAuthors() {
		return authorService.getValues();
	}
	
	@PostMapping("/add")
	public List<Author> addAuthor(@RequestBody Author author){
		return authorService.addAuthor(author);
	}
	
//	@PostMapping("/add")
//	public List<Author> addAuthor(@RequestBody Author author){
//		authorService.addAuthor(author);
//		return authorService.getValues();
//	}
	
	@DeleteMapping("/delete")
	public List<Author> deleteAuthor(@RequestParam Integer id){
		return authorService.removeAuthor(id);
	}
	
	@PutMapping("/update")
	public List<Author> updateAuthor(@RequestParam int id, String new_firstName, String new_lastName, String new_date){
		return authorService.updateAuthor(id,new_firstName, new_lastName,new_date);
	} 

}
