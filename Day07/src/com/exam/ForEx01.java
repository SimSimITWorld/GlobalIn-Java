package com.exam;

/* 문]
 *     0에서부터 입력한 정수까지의 합을 구하는 프로그램을 작성하시오.
 *     입력은 Scanner 클래스로 구현
 */

import java.util.*;

public class ForEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i<=num;i++) {
			sum += i;
		}
		System.out.printf("0부터 %d까지의 합계 : %d\n",num, sum);
	}

}
