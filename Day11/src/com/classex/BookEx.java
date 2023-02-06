package com.classex;

public class BookEx {

	
	public static void Book() { // 인스턴스 메소드
		// 객체 선언
		Book myBook;
		// 객체 생성
		myBook = new Book();
		
		// Book myBook = new Book();
		
		myBook.name = "자바의 정석";
		myBook.price = 500;
		
		System.out.println("책 제목은 " + myBook.name +"이고, 책 가격은 " + myBook.price + "원");
	}
	
	
	public void Book(String name, int price) {
		Book myBook = new Book();
		myBook.name = name;
		myBook.price = price;
		System.out.println("책 제목은 " + myBook.name +"이고, 책 가격은 " + myBook.price + "원");
	}
	
	
	public static void main(String[] args) {
	
	    // 객체 선언
		// Book myBook;
	
		// 객체 생성
		// myBook = new Book();
		
		// myBook.name = "";
		
		// 객체 생성
		BookEx be = new BookEx();
		// 인스턴스 메소드 호출
		be.Book();
		
		BookEx.Book();
		be.Book("홍길동전", 5000);

		
		
	}
}
