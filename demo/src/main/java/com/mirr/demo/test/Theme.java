package com.mirr.demo.test;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="themes")
public class Theme {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "theme_id",nullable=false)
	private int id;
	
	@Column(name="name", nullable= false)
	private String name;
	
	@Column (name="description", nullable=true)
	private String description;
	
	
	public Theme(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString() {
        return "Theme{id=" + id + ", name='" + name + "', description='" + description + "'}";
    }
	
	
}
