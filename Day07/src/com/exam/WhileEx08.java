package com.exam;

/* 문]
 *      - 1^2+2^2-3^2+4^2-5^+....+100^2 의 합계를 구하는 프로그램을 작성하시오.
 * 
 */

public class WhileEx08 {

	public static void main(String[] args) {
		
	int sum = 0;	
	int plus = 1;
	int i = 1;
	while(i <= 100) {
		plus = -plus;
		sum += plus*(i*i);
		i++;
	}
	System.out.println("결과 : " + sum);
	
	}

}
