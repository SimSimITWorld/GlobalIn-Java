package com.enumex;

public class InnerOuterTest {

	static int a = 10;
	int b = 20;
	
	class InnerNested {
		
		int c = 30;
		
		public void write() {
			
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
			
		}
		
		
	}
	public static void main(String[] args) {
		
		InnerOuterTest iot = new InnerOuterTest(); // 바깥쪽
		// 외부클래스의 객체를 먼저 생성한다.
		
		// 외부클래스를 통해서 내부클래스의 객체를 생성한다.
		InnerOuterTest.InnerNested iiin = iot.new InnerNested(); // 안쪽
		
		//iot.write();
		iiin.write();
		
	}
}
