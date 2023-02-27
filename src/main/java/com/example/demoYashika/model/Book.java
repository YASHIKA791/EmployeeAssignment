package com.example.demoYashika.model;

public class Book {
 private int bookId;
 private String bookName;
 private String bookAuthor;
 private String bookPublisher;
 private Category c;
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getBookAuthor() {
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}
public String getBookPublisher() {
	return bookPublisher;
}
public void setBookPublisher(String bookPublisher) {
	this.bookPublisher = bookPublisher;
}
public Category getC() {
	return c;
}
public void setC(Category c) {
	this.c = c;
}
public Book(int bookId, String bookName, String bookAuthor, String bookPublisher, Category c) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.bookAuthor = bookAuthor;
	this.bookPublisher = bookPublisher;
	this.c = c;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
