package com.classex01;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		System.out.println("자동차 색깔 : " + car.getColor());
		System.out.println("자동차 속도 : " + car.getSpeed());

		car.changecol("노란색");
		System.out.println("자동차 색깔 : " + car.getColor());
		car.speedUp(100);
		System.out.println("자동차 속도 : " + car.getSpeed());
	}

}
