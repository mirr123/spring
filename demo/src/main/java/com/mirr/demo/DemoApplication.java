package com.mirr.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mirr.demo.test.Author;
import com.mirr.demo.test.AuthorServices;
import com.mirr.demo.test.Book;
import com.mirr.demo.test.Theme;
import com.mirr.demo.test.ThemesServices;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
//		ThemesServices tsrv= new ThemesServices(); 
//		tsrv.addTheme(new Theme(1,"name1","desc1"));
//		tsrv.addTheme(new Theme(2,"name2","desc2"));
//		tsrv.addTheme(new Theme(3,"name3","desc3"));
//		
//		System.out.println("Returned themes: " + tsrv.getValues());
//
//		
//		tsrv.removeTheme(2);
//		
//		System.out.println("After removing.");
//		
//		tsrv.updateTheme(1, "name32", "decr10");
//		
//	    System.out.println("Returned themes: " + tsrv.getValues());
//	    
//	    /////////////////
//	    AuthorServices auth= new AuthorServices();
//	    
//	    auth.addAuthor(new Author(1,"Kostas", "Pap","10.04.1999"));
//	    auth.addAuthor(new Author(2,"Nikos", "Nik","04.05.1998"));
//	    auth.addAuthor(new Author(3,"Mir", "Goud","10.04.2000"));
//
//	    
//		System.out.println("Returned authors: " + auth.getValues());
//		
//	    auth.updateAuthor(1,"Kostas", "Papapetrou","10.04.1999");
//	    auth.removeAuthor(2);
//	    
//		System.out.println("Authors after removing: " + auth.getValues());
//
//	    

	}

	
}
