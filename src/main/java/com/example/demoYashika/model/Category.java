package com.example.demoYashika.model;

public class Category {
private int categoryId;
private String author;
private String title;
private String gender;
private String publisher;
private String country;
public Category(int categoryId, String author, String title, String gender, String publisher, String country) {
	super();
	this.categoryId = categoryId;
	this.author = author;
	this.title = title;
	this.gender = gender;
	this.publisher = publisher;
	this.country = country;
}
public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Category() {
	super();
	// TODO Auto-generated constructor stub
}


}
