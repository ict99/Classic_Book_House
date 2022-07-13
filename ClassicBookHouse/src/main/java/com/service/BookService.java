package com.service;

import java.util.ArrayList;
import com.model.Book;

//use appropriate annotation to configure ElectricityService as a Service

public class BookService {
	private ArrayList<Book> bookList=new ArrayList<Book>();
	
	//	Validate ISBN number and add book object into the book list
	public boolean addBook(Book book) {	
		//fill the code
		return false;
	}
	
	
	public ArrayList<Book> viewAllBooks(){
		//fill the code
		return null;
	}
	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> list) {
		this.bookList = list;
	}


}
