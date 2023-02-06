package com.exam;

/* factorial : 5! = 1 * 2 * 3 * 4 * 5 = 120
 * 
 * 문]
 *     사용자로부터 n이라는 수를 입력받아 n!을 계산하는 프로그램을 작성하시오.
 */

import java.util.*;

public class ForEx05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 값 입력 : ");
		int n = sc.nextInt();
		int value = 1;
		
		for(int i = 1; i <= n; i++) {
			if(i != n) {
				System.out.print(i + " * ");
			}else {
				System.out.print(i + " = ");
			}
			value *= i;
		}
		System.out.println(value);
		
		
		
		System.out.print("정수 입력 : ");
		int num1, sum = 1;
		num1 = sc.nextInt();
		
		for(int i = 1; i <= num1; i++) {
			sum *= i;
		}
		System.out.println(n + "의 팩토리얼은 " + sum + "입니다.");
		

	}

}
