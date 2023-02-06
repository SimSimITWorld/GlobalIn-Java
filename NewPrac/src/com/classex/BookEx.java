package com.classex;

public class BookEx {

	public static void Book() {
		Book myBook = new Book();
		myBook.setName("자바의 정석");
		myBook.setPrice(500);
		
		System.out.println("책 제목은 " + myBook.getName() + "이고, 책 가격은 " + myBook.getPrice() + "원");
	}
	
	public static void main(String[] args) {
		
		BookEx myBook = new BookEx();
		
		myBook.Book();
		
		Book my = new Book("홍길동전", 5000);
		System.out.println("책 제목은 " + my.getName() + "이고, 책 가격은 " + my.getPrice() + "원");
		

	}

}
