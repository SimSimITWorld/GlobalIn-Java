package com.ex;

/* 임의의 정수 입력 : 10
 * 
 * 1 ~ 10 까지의 합계 : 55
 * 계속 하시겠습니까?[y/n] : y
 * 임의의 정수 입력 : 100
 * 1 ~ 100까지의 합계 : 5050
 * 계속 하시겠습니까?[y/n] : n
 * 
 * 단, 입력 정수의 범위는 1 ~ 1000까지로
 */

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 변수 선언
		int n, tot = 0;
		char ch = ' ';
		
		while(true) {
			
			do {
				System.out.print("임의의 정수 입력 : ");
				n = sc.nextInt();
				
			} while(n<1 || n >1000); // 정수의 범위
			
			// 1 부터 n 까지의 누적 합계를 구한다.
			tot = 0;
			for(int i = 1; i<=n;i++) {
				tot+=i;
			}
			System.out.println("1 ~ " + n + "까지의 합계 : " + tot);
			
			System.out.print("계속 하시겠습니까?[y/n] : ");
			ch = sc.next().charAt(0);
			// y/Y 값이 아니라면 그만
			
			// 입력받은 값이 y/Y가 아니라면 멈춘다. while문을 빠져 나간다.
			if(ch != 'y' && ch != 'Y') {
				break;
			}
			
			
		}
		

	}

}
