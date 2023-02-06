package com.classexam;

public class Tv { // 클래스의 정의(설계도)

	// 멤버필드 (속성, 변수)
	// 색상
	String color;
	// 전원상태
	boolean power;
	// 채널
	int channel;
	
	// 메소드 (기능, 행위, 동작)
	// Tv를 켜거나 끄는 기능 메소드를 정의
	public void power() {
		power = !power;
	};
	
	public void channelUp() {++channel;} // 채널을 올리는 기능
	public void channelDown() {--channel;} // 채널을 내리는 기능
	
	
	
	
	
}
