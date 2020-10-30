package com.ass6.que3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestQue3 {
	
	public static void main(String[] args) {
		
		Book book = new Book(1, "c", "Dennis");
		Book book1 = new Book(2, "java", "gosling");
		Book book2 = new Book(3, "python", "rossum");
		Book book3 = new Book(4, "gravity", "einstein");
		
		
		BookCollection bookCol = new BookCollection();
		bookCol.bookList.add(book);
		bookCol.bookList.add(book1);
		bookCol.bookList.add(book2);
		bookCol.bookList.add(book3);
		
		System.out.println("---------------before sorting---------------");
		printBooks(bookCol.bookList);
		
		//check whether book is there or not
		Book bookUpdate = new Book("java", "james");
		bookCol.hasBook(bookUpdate);
		
		//sort
		System.out.println("---------------after sorting by book title---------------");
		bookCol.sortByBookName();
		

		System.out.println("---------------after sorting by author ---------------");
		bookCol.sortByAuthor();
	}
	
	private static void printBooks(List<Book> bookList) {
		//print the book
		for(Book book: bookList) {
			System.out.println(book);
		}
	}

}