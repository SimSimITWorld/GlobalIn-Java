package com.methodex;

public class StaticMain {

	public static void main(String[] args) {
		
		//System.out.println(StaticEx.x); // 에러 : 객체를 생성해야만 접근 가능함
		System.out.println(StaticEx.y); // 클래스변수이므로 객체를 생성하지 않아도 접근 가능
		//StaticEx.y = 100;
		System.out.println(StaticEx.y);
		// 객체 생성
		StaticEx se = new StaticEx();
		System.out.println("x : " + se.x); // 0
		System.out.println("y : " + se.y); // 100
	}

}
