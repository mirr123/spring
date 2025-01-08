package com.mirr.demo.test;

import java.util.ArrayList;
import java.util.List;

public class BookServices {
	
	private List<Book> books= new ArrayList<Book>();
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void removeTheme(Book book) {
		books.remove(book);
	}

}
