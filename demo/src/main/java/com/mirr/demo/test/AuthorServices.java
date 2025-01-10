package com.mirr.demo.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AuthorServices {
	
	private List<Author> authors= new ArrayList<Author>();

	public List<Author> addAuthor(Author author) {
		authors.add(author);
		return authors;
	}

	public List<Author> removeAuthor(int id) {
		authors.removeIf(author -> author.getId() == id );
		return authors;
	}
	
	public List<Author> getValues() {
        System.out.println("Getting all themes:");
        for (Author author : authors) {
            System.out.println(author);
        }
        return authors;
    }
	
	public List<Author> updateAuthor(int id, String new_firstName,String new_lastName, String new_date){
		for (Author author : authors) {
			if (author.getId() == id) {
				if (new_firstName != null)
					author.setFirstName(new_firstName);
				if (new_lastName != null)
					author.setFirstName(new_lastName);
				if (new_date != null)
					author.setDateOfBirth(new_date);;
			}
		}
		return authors;
	}

	@Override
	public String toString() {
		return "AuthorServices [authors=" + authors + "]";
	}
	
	
}
