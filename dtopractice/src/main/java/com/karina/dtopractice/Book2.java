package com.karina.dtopractice;

public class Book2 
{
int id;
int price;
String bookname;
public Book2(int id, int price, String bookname) {
	super();
	this.id = id;
	this.price = price;
	this.bookname = bookname;
	
}
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
}
