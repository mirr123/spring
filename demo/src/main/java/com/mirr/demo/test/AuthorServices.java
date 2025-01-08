package com.mirr.demo.test;

import java.util.ArrayList;
import java.util.List;

public class AuthorServices {
	
	private List<Author> authors= new ArrayList<Author>();
	
	public void addAuthor(Author author) {
		authors.add(author);
	}
	
	public void removeAuthor(Author author) {
		authors.remove(author);
	}

}
