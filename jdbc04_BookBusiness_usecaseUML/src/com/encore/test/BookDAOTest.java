package com.encore.test;

import java.util.ArrayList;

import com.encore.dao.impl.BookDAOImpl;
import com.encore.vo.Book;

import config.ServerInfo;

public class BookDAOTest {

	public static void main(String[] args) {
		BookDAOImpl dao = BookDAOImpl.getInstance();
		try {
//			System.out.println(dao.isIsbn("7G7"));
			//dao.registerBook(new Book("8H8", "자율주행2", "로드만", "encore", 34000));
			//System.out.println("책등록 성공");
		}catch(Exception e) {
			System.out.println("책등록 실패");
		}
		
		try {
			//dao.deleteBook("8H88");
		}catch(Exception e) {
			System.out.println("책삭제 실패");
		}
		try {
			//ArrayList<Book> returnList =dao.findByWriter("나가타");
			//for(Book b : returnList) System.out.println(b);
		}catch(Exception e) {
			
		}
		
		try {
//			ArrayList<Book> returnList = dao.findByPrice(10000, 20000);
//			for(Book b : returnList) System.out.println(b);
		}catch(Exception e) {		
			System.out.println("잘못된 가격..");
		}
		
		try {
			dao.discountBook(10, "동아");
		}catch(Exception e) {
			
		}

	}
	
	static {
		try {
			Class.forName(ServerInfo.DRIVER);
			System.out.println("드라이버 로딩 성공~~!!");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패~~!!");
		}
	}

}