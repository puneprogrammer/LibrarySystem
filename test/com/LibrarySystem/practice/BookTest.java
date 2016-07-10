package com.LibrarySystem.practice;

import junit.framework.TestCase;

public class BookTest extends TestCase{
	
	public void testBook() {
		Book b1 = new Book("Godfather");
		assertEquals("Godfather", b1.title);
		assertEquals("Unknown Author", b1.author);
		
		Book b2 = new Book("Sicilian","Mario");
		assertEquals("Sicilian",b2.title);
		assertEquals("Mario",b2.author);
	}
	
	public void testToString(){
	Book b2 = new Book("Sicilian","Mario");
	assertEquals("Book Title: Sicilian\n Author: Mario", b2.toString());
	}
	
}
