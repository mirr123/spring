package com.mirr.demo.test;

public class Book {
	
	private int id;
	private String title;
	private Author author;
	private String publisher;
	private int publisherYear;
	private String description;
	private String themes;
	
	public Book(int id, String title, Author author, String publisher, int publisherYear, String description,
			String themes) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publisherYear = publisherYear;
		this.description = description;
		this.themes = themes;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPublisherYear() {
		return publisherYear;
	}
	public void setPublisherYear(int publisherYear) {
		this.publisherYear = publisherYear;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getThemes() {
		return themes;
	}
	public void setThemes(String themes) {
		this.themes = themes;
	}
	
	
	
	
	
}
