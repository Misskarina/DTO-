package com.karina.dtopractice;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@JsonIgnoreType
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	int price;
	String bookname;
	int no_page;
	public Book() {
		super();
		
	}
	public Book(int id, int price, String bookname, int no_page) {
		super();
		this.id = id;
		this.price = price;
		this.bookname = bookname;
		this.no_page = no_page;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	Author author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getNo_page() {
		return no_page;
	}
	public void setNo_page(int no_page) {
		this.no_page = no_page;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	

}
