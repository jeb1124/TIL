package com.encore.test;

import com.encore.service.impl.BookManagerImpl;
import com.encore.vo.Book;
import com.encore.vo.Magazine;
import com.encore.vo.novel;

public class BookTest {

	public static void main(String[] args) {
		BookManagerImpl.getInstance().insertBook(new novel("111","java","�Ѻ�","������",18000.0,"A"));
		BookManagerImpl.getInstance().insertBook(new Magazine("222","����21","cgv","������",10000.0,"B"));
		
		System.out.println(BookManagerImpl.getInstance().getNumberOfBooks());//���� å ����
		
		Book[] bk = BookManagerImpl.getInstance().getAllBook(); // ���� å ����
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}

		System.out.println("Search lsbn"); //
		System.out.println(BookManagerImpl.getInstance().searchBookBylsbn("111"));
		
		System.out.println("Search Title");
		bk = BookManagerImpl.getInstance().searchBookByTitle("java");
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}

		System.out.println("Search Publisher");
		bk = BookManagerImpl.getInstance().searchBookByPublisher("������");
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}

		System.out.println("Search Price");
		bk = BookManagerImpl.getInstance().searchBookByPrice(18000.0);
		for(Book i : bk) {
			if(i!=null) System.out.println(i);
		}
		System.out.println(BookManagerImpl.getInstance().getSumpriceOfBooks());
		System.out.println(BookManagerImpl.getInstance().getAveragePriceOfBooks());

		System.out.println("###novel####");
		BookManagerImpl.getInstance().novelInfo();
		System.out.println("###Magzine####");
		BookManagerImpl.getInstance().magzineInfo();
	}
}