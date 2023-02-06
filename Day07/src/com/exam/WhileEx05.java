package com.exam;

/* 문]
 *      사용자로부터 임의의 정수를 입력받아 1부터 입력받은 수까지의 전체 합계와 짝수의 합계;
 *      홀수의 합계를 각각 결과 값을 출력하는 프로그램을 작성하시오.
 *     
 *      ex) 50
 *      
 *      1 ~ 10까지의 전체의 합계 : 55
 *      1 ~ 10까지의 짝수의 합계 : 30
 *      1 ~ 10까지의 홀수의 합계 : 25
 *      
 *      1 ~ 50까지의 전체의 합계 : 1275
 *      1 ~ 50까지의 짝수의 합계 : 650
 *      1 ~ 50까지의 홀수의 합계 : 625
 */

import java.util.*;

public class WhileEx05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		int sum = 0, value1 = 0, value2 = 0;
		int i = 1;
		
		while (i <= n) {
			sum+=i;
			if(i%2==0) {
			    value1 += i;
			}else {
				value2 += i;
			}
			
			if(i==n) {
				System.out.printf("1 ~ %d까지의 전체의 합 : %d\n",i,sum);
				System.out.printf("1 ~ %d까지의 짝수의 합 : %d\n",i,value1);
				System.out.printf("1 ~ %d까지의 홀수의 합 : %d\n",i,value2);
				System.out.println();
			} else if (i%10==0){
				System.out.printf("1 ~ %d까지의 전체의 합 : %d\n",i,sum);
				System.out.printf("1 ~ %d까지의 짝수의 합 : %d\n",i,value1);
				System.out.printf("1 ~ %d까지의 홀수의 합 : %d\n",i,value2);
				System.out.println();
			}
			i++;
		}
		
		

	}

}
