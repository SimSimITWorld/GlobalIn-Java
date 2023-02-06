package com.classexam;

public class LgTv {

	public static void main(String[] args) {
		
		Tv tv; // 객체 선언 --> 인스턴스를 참조하기 위한 참조변수
		
		
		
		
		tv = new Tv(); // 객체 생성 --> Tv 인스턴스를 생성함
		
		// Tv tv = new Tv();
		
		tv.channel = 24;
		// 채널에 값을 24로 할당함
		
		// tv 객체의 메소드를 호출함
		tv.channelDown(); // 현재의 채널 23
		
		System.out.println("현재 LG TV의 채널은 " + tv.channel + "입니다.");
		
		
		
		

	}

}
