package com.exam;

import java.util.*;

public class WhileEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, sum = 0, i = 0;

		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		while(i<=n) {
			sum += i;
			i++;
		}
		
		System.out.printf("0부터 %d까지의 합계 : %d", n, sum);
	}

}
