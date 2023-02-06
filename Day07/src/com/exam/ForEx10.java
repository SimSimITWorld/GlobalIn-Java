package com.exam;

/* 문]
 *      입력된 정수의 평균을 구하는 프로그램을 작성하시오.
 *      
 *      1. 사용자로부터 정수의 개수를 입력받는다.
 *      2. 입력받은 수만큼 평균을 구한다.
 *      3. 입력된 값은 정수지만 출력은 실수 처리하시오.
 *      
 *      3
 *      10
 *      20
 *      30
 */

import java.util.*;

public class ForEx10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("개수 입력 : ");
		int n = sc.nextInt();
		int sum=0;
		for(int i = 1;i<=n;i++) {
			System.out.print("값 입력 : ");
			int value = sc.nextInt();
			sum += value;
		}
		double avg = sum/(double)n;
		
		System.out.println("출력 : " + avg);

	}

}
