package com.classex01;

public class Car { // 클래스 정의
	// 속성, 필드(변수) 선언
	protected String color; // 속성선언(색)
	public int speed; // 속성선언(속도)
	
	public Car() {
		
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	public Car(String color, int speed) {
		this.color = color;
		this.speed =speed;
	}
	
	public void color(String color, String color2) {
		this.color = color;
		this.color = color2;
	}
	
	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}

	
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void speedUp(int v) {
		speed += v;
		System.out.println("현재 당신의 속도는 " + speed + "km입니다.");
	}
	
	void speedDown(int v) {
		speed -= v;
		System.out.println("현재 당신의 속도는 " + speed + "km입니다.");
	}
	
	void prt() {
		Car c = new Car();
		System.out.println(c.speed);
		System.out.println(speed);
	}

}
