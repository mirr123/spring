package com.mirr.demo.test;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="authors")
public class Author {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "author_id",nullable=false)
	private int id;
	
	@Column(name="firstName", nullable= false)
	private String firstName;
	
	@Column(name="lastName", nullable= false)
	private String lastName;
	
	@Column(name="dateOfBirth", nullable= true)
	private String dateOfBirth;
	
	
	public Author(int id, String firstName, String lastName, String dateOfBirth) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}	
	
	public String toString() {
        return "Theme{id=" + id + ", name='" + firstName + "', last name='" + lastName + "'}";
    }
	
}
