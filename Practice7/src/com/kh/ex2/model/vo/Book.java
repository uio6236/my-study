package com.kh.ex2.model.vo;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {}
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	public Book(String title, String publisher, String author, 
				int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	public String getTitle() {
		return this.title;
	}
	public void	setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return this.publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return this.discountRate;
	}
	public void	setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public void inform() {
		System.out.printf("도서명: %s 저자명: %s 출판사: %s 가격: %d 할인율: %.2f", 
		this.title,
		this.publisher,
		this.author,
		this.price,
		this.discountRate);
		System.out.println();
	}
}
