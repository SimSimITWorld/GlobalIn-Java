package com.arrayex;

import java.util.*;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// int[] aa = new int[4]; // 배열 선언
		int aa[];
		aa = new int[4];
		int i, sum=0;
		
		for(i = 0 ;i<=3;i++) {
		System.out.print((i+1) +"번째 정수 입력 : ");
		aa[i] = sc.nextInt();
		// sum +=aa[i];
		}
		
		for(int cc : aa) {
			sum+=cc;
			// System.out.println("cc : " + cc);
		}

		// sum = aa[0] + aa[1] + aa[2] + aa[3];
		System.out.println("sum : " + sum);
	}

}
