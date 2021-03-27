package com.encore.service;

import java.util.ArrayList;

import com.encore.vo.Book;

public interface BookMgr {
	void addBook(Book book);
	ArrayList<Book> getAllBook();
	Book searchBookByIsbn(String book);
	ArrayList<Book> searchBookByTitle(String title);
	ArrayList<Book> onlySearchBook();
	ArrayList<Book> onlySearchMagazine();
	ArrayList<Book> magazineOfThisYearInfo(int year);
	ArrayList<Book> searchBookByPublisher(String publisher);
	ArrayList<Book> searchBookByPrice(int price);
	int getTotalPrice();
	int getAvgPrice();	
}
