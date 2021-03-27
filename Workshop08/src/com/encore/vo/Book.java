package com.encore.vo;

public abstract class Book {
	private String isbn; //Book 기본 필드 
	private String title;
	private String author;
	private String pulisher;
	private int price;
	private String desc;
	
	public Book(String isbn, String title, String author, String pulisher, int price, String desc) { // Book 공통 생성자
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.pulisher = pulisher;
		this.price = price;
		this.desc = desc;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	public String getPulisher() {
		return pulisher;
	}
	public void setPulisher(String pulisher) {
		this.pulisher = pulisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", pulisher=" + pulisher + ", price="
				+ price + ", desc=" + desc + "]";
	}	
}