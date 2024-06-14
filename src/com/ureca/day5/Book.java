package com.ureca.day5;

public class Book implements Comparable<Book>{
	String isbn;
	String title;
	int price;
	
	public Book(String isbn, String title, int price) {
		setIsbn(isbn);
		setTitle(title);
		setPrice(price);
	}
	
	public int compareTo(Book b) {
		
		//오름차순
		//return this.isbn.compareTo(b.isbn);
		
		
		//내림차순
		//return b.isbn.compareTo(this.isbn);
		
		// 단, 이렇게 표현도 가능 
		//return -this.isbn.compareTo(b.isbn);
		
		
	
		//int 자료형 정렬하기 (오름)
		//return Integer.compare(this.price, b.price);
		// 내림
		return Integer.compare(this.price, b.price);
		
	}
	
	public Book() {}

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return getIsbn()+" / "+getTitle()+" / "+getPrice()+" / ";
	}

	
}
