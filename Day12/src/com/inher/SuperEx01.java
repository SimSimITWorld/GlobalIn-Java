package com.inher;

public class SuperEx01 extends SuperEx {

	protected int b = 100;
	
	public void print() { // SuperEx01 클래스의 인스턴스 메소드
	//	System.out.println("SuperEx01 print() 메소드 : " + a + b + c);
		// 부모클래스에서 선언된 변수 a는 접근이 불가함
		// 접근 변경자가 private 이기 때문
		
		System.out.println("SuperEx01 print() 메소드 : " + super.b + " : " + c);
	}
	
	@Override // (어노테이션)
	public void write() { // 오버라이딩
		System.out.println("SuperEx01 write() 메소드 : " + b + " : " + c);
	}
}
