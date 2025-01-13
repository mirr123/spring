package com.mirr.demo.test;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "book_id",nullable=false)
	private int id;
	
	@Column(name="title", nullable= false)
	private String title;
	
	@Column(name="author", nullable= false)
	private Author author;
	
	@Column(name="publisher", nullable= true)
	private String publisher;
	
	@Column(name="publisherYear", nullable= true)
	private int publisherYear;
	
	@Column (name="description", nullable=true)
	private String description;
	
	@Column (name="themes", nullable=true)
	private Theme themes;
	
	public Book(int id, String title, Author author, String publisher, int publisherYear, String description,
			Theme themes) {
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
	public Theme getThemes() {
		return themes;
	}
	public void setThemes(Theme themes) {
		this.themes = themes;
	}
	
	
	
	
	
}
