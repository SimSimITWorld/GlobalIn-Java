package com.forex;

// 1부터 10까지의 합계


public class ForEx01 {

	public static void main(String[] args) {
		
		// 변수 선언
		
		int sum=0;
		
		for(int i=1;i<=10;i++) {
			
			// 누적의 합
			sum += i; // sum = sum + i;
			System.out.println("1부터 "+ i +"까지의 합계 : " + sum);
			
		}
		
		
		System.out.println("1부터 10까지의 합계 : " + sum);

	}

}
