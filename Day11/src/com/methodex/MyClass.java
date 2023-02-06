package com.methodex;

public class MyClass {

	private String name;
	private int age;
	
	public MyClass() {
		name = "무명";
	}
	
	public MyClass(String n) {
		this(); // 기본 생성자 호출
		name = n;
	}
	
	public MyClass(String n, int a) {
		this(n);
		// name = n;
		age = a;
	}
	
	public MyClass(int a, String n) {
		this(n, a);
		//name = n;
		//age = a;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	
	
}
