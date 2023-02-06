package com.classexam;

public class Circle {
	
	// 원의 반지름
	int radius;
	// 원의 이름
	public String name;
	
	// 생성자 함수
	public Circle() {};
	
	public Circle(int r) {
		// 기본 생성자 : 매개변수가 없고, 아무 일 없이 단순함
		radius = r;
		//name = " ";
	}
	
	
	
	public Circle(int r, String n) {
		this(); // 생성자를 의미 , 반드시 첫 줄에 와야함 
		this.radius = r;
		this.name = n;
	}
	
	/*
	void set(int r) {
		radius = r;
	}
	
	// 원의 면적을 구하는 메소드 정의
	public double getArea() {
		return 3.14*radius*radius;
	}
	*/
}
