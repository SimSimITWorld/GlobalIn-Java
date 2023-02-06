package com.exam;

/* 문]
 *     사용자로부터 하나의 숫자를 입력받은 다음, 그 수만큼 3의 배수를 출력하는 프로그램을 작성하시오.
 *     
 *     8
 *     3 6 9 12 15 18 21 24
 */

import java.util.*;

public class ForEx09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int sum = 0;
		final int value = 3;
		for(int i=1;i<=n;i++) {
			sum = value*i;
			System.out.print(sum + " ");
			}
		
		System.out.println();
		
		for(int i = 1; i<=n;i++) {
			System.out.print(i*4 + " ");
		}
		

	}

}
