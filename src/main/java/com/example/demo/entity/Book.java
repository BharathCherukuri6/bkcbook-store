package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

	private String author;
    // Add more fields as needed

	public String getAuthor() {
		return author;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
    // Setter method for id field
    public void setId(Long id) {
        this.id = id;
    }

    // Constructors, getters, setters, and other methods will go here
    
    public void setTitle(String title) {
		this.title = title;
	}
}