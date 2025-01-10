package com.mirr.demo.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookServices {
	
	
	private List<Book> books= new ArrayList<Book>();
	
	public List<Book> addBook(Book book) {
		books.add(book);
		return books;
	}
	
	public List<Book> removeBook(int id) {
		books.removeIf(book -> book.getId() == id );
		return books;
	}
	
	public List<Book> getValues() {
//        System.out.println("Getting all themes:");
//        for (Theme book : books) {
//            System.out.println(book);
//        }
        return books;
    }
	
	public List<Book> updateBook(int id, String newTitle ,Author newAuthor, String newPublisher, int newYear, String newDesc, ArrayList<Theme> newThemes) {
		for (Book book : books) {
			if (id == book.getId()) {
				if (newTitle != null)
					book.setTitle(newTitle);;
				if (newAuthor != null)
					book.setAuthor(newAuthor);
				if (newPublisher != null)
					book.setPublisher(newPublisher);
				//if (newYear != 0)
				//	book.setPublishedYear(newYear);
				if (newDesc != null)
					book.setDescription(newDesc);
				//if (newThemes != null)
				//	book.setTheme(newThemes));				
			}
		}
		return books;
	}
	
	

}
