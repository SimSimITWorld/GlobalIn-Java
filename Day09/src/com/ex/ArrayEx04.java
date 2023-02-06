package com.ex;

/* 문]
 *     정수 10개를 저장할 배열을 선언하고 1에서 10까지 범위의 정수를 랜덤하게 생성하여
 *     배열에 저장하고, 저장된 배열을 숫자들과 평균을 출력하는 프로그램을 작성하시오.
 *     
 *     hint)
 *     1 에서부터 10까지의 정수를 랜덤하게 생성하는 코드
 *     int i = (int)(Math.random() * 10 + 1);
 */

import java.util.*;

public class ArrayEx04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] n = new int[10];
		int sum = 0;
		for(int i = 0;i<n.length;i++) {
			n[i] = (int)(Math.random()*10+1);
			sum += n[i];
		}
		float avg = sum/(float)n.length;
		System.out.print("입력된 숫자 : ");
		for(int i = 0;i<n.length;i++) 
			System.out.print(n[i]+" ");
		
		System.out.println("\n숫자의 합 : " + sum);
		System.out.println("숫자의 평균 : " + avg);
		
		// 배열선언
		int[] a = new int[10];
		// 10개의 랜덤한 정수를 생성해서 배열에 저장
		for(int i = 0;i<a.length;i++) {
			int r = (int)(Math.random()*10+1);
			a[i] = r; // 랜덤으로 생성한 정수를 배열에 저장
			// System.out.print(a[i]+"\t");
		}
		
		// 합계를 구함
		int sum_1 = 0;
		for(int i =0;i<a.length;i++) {
			sum+=n[i];
		}
		// 랜덤한 정수 출력
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		// 평균 출력
		System.out.println("평균 : " + (double)sum/a.length);
	}

}
