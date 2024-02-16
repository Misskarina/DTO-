package com.karina.dtopractice;
//bidirectional one to one mapping

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	int publication_year;
	String author_name;
	public Author() {
		super();
	}
	public Author(int id, int publication_year, String author_name) {
		super();
		this.id = id;
		this.publication_year = publication_year;
		this.author_name = author_name;
	}
	@OneToOne(cascade=CascadeType.ALL)
	Book book;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPublication_year() {
		return publication_year;
	}
	public void setPublication_year(int publication_year) {
		this.publication_year = publication_year;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

}
