package com.arrayexam;

/* 문]
 *     사용자로부터 임의의 정수를 임의의 개수만큼 입력받아
 *     입력받은 수중 가장 큰 수를 출력하는 프로그램
 *     
 *     단, 배열로 구현하시오.
 *     
 *     int[] aa = new int[n];
 *     
 *     입력할 개수 : 9 => n
 *     데이터 입력[공백으로 구분] : 4 7 9 1 3 2 5 6 8 
 *     가장 큰 수 : 9
 */

import java.util.*;

public class ArrayEx06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int max;
		
		System.out.print("입력할 개수 : ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		System.out.print("데이터 입력[공백으로 구분] : ");
		for(int i = 0;i<a.length;i++) 
			a[i] = sc.nextInt();
		
		max =0;
		
		for(int i = 0;i<a.length;i++) {
			if(max<a[i]) 
				max = a[i];
			
		}
		
		System.out.println("가장 큰 수 : " + max);
		
	}

}
