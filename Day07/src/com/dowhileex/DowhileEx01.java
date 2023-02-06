package com.dowhileex;

// 1부터 10까지의 합계

public class DowhileEx01 {

	public static void main(String[] args) {


		int i = 1, sum = 0;
		
		do {
			sum = sum + i;
			i++;
		} while(i<=10);
		
		System.out.println("1부터 10까지의 합계 " + sum);

	}

}
