package com.exam;

/* 문]
 *     두개의 정수를 입력받아서 그 사이에 존재하는 정수들의 합을 구하는 프로그램 작성
 *     ex) 3 5 >>  3 + 4 + 5 = 12
 *     ex) 5 3 >>  = 12
 */
import java.util.*;

public class ForEx04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		
			System.out.print("두개의 정수 입력 : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a>b) {
				a = a^b;
				b = b^a;
				a = a^b;
			}
			for(;a<=b;a++) {
				if(a!=b) {
				System.out.print(a + " + " );
				} else {
					System.out.print(a + " = ");
				}
				sum +=a;
			}
			System.out.print(sum);
			
			int n1, n2, sum_1 = 0;
			
			System.out.print("첫번째 정수 입력 : ");
			n1 = sc.nextInt();
			System.out.print("두번째 정수 입력 : ");
			n2 = sc.nextInt();
			
			if(n1>n2) {
				n1 = n1^n2;
				n2 = n2^n1;
				n1 = n1^n2;
			}
			
			for(int i = n1; i <=n2; i++) {
				sum +=i;
				}
			
			System.out.println("두 정수 사이의 합계 : " + sum);
			

	}

}
