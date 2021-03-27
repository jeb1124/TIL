package com.encore.service.impl;

import java.util.ArrayList;

import com.encore.service.BookMgr;
import com.encore.vo.Book;

public class BookMgrImpl implements BookMgr{
	private BookMgrImpl mgr;
	private ArrayList<Book> list;
	
	static private BookMgrImpl service = new BookMgrImpl();
	private BookMgrImpl() {	
		list = new ArrayList<Book>();
	}
	
	public static BookMgrImpl getInstance() {
		return service;
	}	
	

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Book> getAllBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book searchBookByIsbn(String book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAvgPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
