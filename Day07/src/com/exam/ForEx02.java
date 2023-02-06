package com.exam;

/* 문]
 *     양의 실수만 입력받아 입력받은 개수만큼 합계와 평균을 출력하시오.
 *     단, 음의 정수를 입력하면 계산 하시오.
 */

import java.util.*;

public class ForEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float i = 0.0f, sum = 0.0f;
		int cnt = 0;
		
		for(;i>=0.0;) {
			sum+=i;
			System.out.print("양의 실수 입력 : ");
			i = sc.nextFloat();
			cnt++;
		}
		System.out.println("지금까지의 합계 : " + sum + ", 평균 : " + sum/(cnt-1));
	
		

	}

}
