package com.exam;

public class Div {

    private int a, b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		int result = 0;
		/*
		if(a>0)
			return a / b;
		else {
			System.out.println("0보다 작습니다.");
			return -1;
		}
		*/
		
		try {
			result = a / b;
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		return result;
		
	}
}
