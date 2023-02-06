package com.classex01;

public class CarEx {

	public static void main(String[] args) {
		
		// Car 클래스에 접근하기 위해서는 객체 또는 인스턴스를 생성한다.
		Car c1 = new Car(); 
		Car c2 = new Car("노랑색");
		
		
		
		
		
		
		
		// 클래스를 이용하여 객체를 생성함
		/*
		c1.color = "빨강";
		c1.speed = 30;
		*/
		//c1.getColor();
		//c1.getSpeed();
		//c1.setSpeed(30);
		System.out.println(c1.getSpeed());
		c1.speedUp(60);
		//System.out.print(c1.speedUp(30));

	}

}
