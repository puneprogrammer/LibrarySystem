package com.LibrarySystem.practice;

public class Book {
	String title;
	String author = "Unknown Author";
	
	public Book(String title) {
		this.title = title;
	}

	public Book(String title,String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String toString(){
		return "Book Title: " + title  + "\n Author: " + author;
	}
}
