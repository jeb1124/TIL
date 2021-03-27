package com.encore.vo;

public class Magazine extends Book{
	public Magazine(String isbn, String title, String author, String pulisher, double price, String desc) {
		super(isbn, title, author, pulisher, price, desc);
	}

	@Override
	public String setKind() {
		return "Magzine";
	}
}
