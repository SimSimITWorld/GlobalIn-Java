package com.classexam;

public class ArrayTv {
	
	int aa; // 전역변수 ( 인스턴스변수) 
	static int bb; // 클래스변수 (공유변수)  

	public static void main(String[] args) {
		
		Tv[] tv = new Tv[3]; // 객체 배열 선언
		
		// 객체 배열 생성
		/*
		tv[0] = new Tv();
		tv[1] = new Tv();
		tv[2] = new Tv();
		*/
		
		Tv[] tv2 = {new Tv(), new Tv(), new Tv()};
		
		for(int i = 0;i<tv.length;i++) {
			tv[i] = new Tv();
			tv[i].channel = 1;
			tv[i].channelUp();
		}
		
		for(int i = 0;i<tv.length;i++) {
		//  tv[i].channelUp();
			tv[i].channelDown();
			System.out.println(tv[i].channel);
		}
		
		
		
		
		
		
	}

}
