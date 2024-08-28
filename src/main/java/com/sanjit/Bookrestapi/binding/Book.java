package com.sanjit.Bookrestapi.binding;

public class Book {
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	private String isbn;
	
	public Book()
	{}
	
	public Book(Integer bookId, String bookName, Double bookPrice, String isbn) {
		
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.isbn = isbn;
	}

	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
	
	
	
	

}

