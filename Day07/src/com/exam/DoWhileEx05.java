package com.exam;

import java.util.*;

public class DoWhileEx05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i =1;
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int value1 = 0, value2 = 0;
		int sum = 0;
		do {
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
		}while (i <= n) ;
	}

}
