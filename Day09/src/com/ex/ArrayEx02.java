package com.ex;

/* 문]
 *     양의 정수를 10개 입력받아 배열에 저장하고, 배열에 저장된 수 중 3의 배수만을 출력하는
 *     프로그램을 작성하시오.
 *     
 *     양의 정수 10개 입력 : 1 5 99 22 345 154 2346 55 32 85
 *     3의 배수 : 99 345 2346
 */

import java.util.*;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 1차원 배열 선언
		int[] num = new int[10];
		
		// 양의 정수 10개를 입력 받을 안내메시지와 입력받아 저장할 변수선언
		// 반복문을 이용하여 입력받음
		System.out.print("양의 정수 10개 입력 : ");
		for(int i = 0;i<num.length;i++) {
			do {
				num[i] = sc.nextInt();
			}while(num[i]<0);
		}
		System.out.print("3의 배수 : ");
		for(int i = 0;i<num.length;i++) {
			if(num[i]%3==0) {
				System.out.print(num[i]+" ");
			}
		}
		System.out.println();
		
		// 1차원 배열 선언
		int arr[] = new int[10];
		
		// 양의 정수 10개를 입력받을 안내메시지와 입력받아 저장할 변수선언
		// 반복문을 이용하여 입력받음
		int i = 0;
		System.out.print("양의 정수 10개 입력 : ");
		for(;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		
		    System.out.print(arr[i]+" ");
		}
		//반복문을 이용하여 3의 배수를 출력
		System.out.println();
		System.out.println("3의 배수 : ");
		for(i = 0;i<arr.length;i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
